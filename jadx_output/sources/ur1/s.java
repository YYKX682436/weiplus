package ur1;

@j95.b
/* loaded from: classes7.dex */
public final class s extends i95.w implements rm.b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f430372d = com.tencent.mm.vfs.q7.c("biz_draft");

    public void Ai(int i17, java.lang.String sceneSubPath, int i18) {
        kotlin.jvm.internal.o.g(sceneSubPath, "sceneSubPath");
        com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "clear draft draftType: " + i17 + ", scene: " + sceneSubPath + ", bizType: " + i18);
        if (!wi(sceneSubPath)) {
            ((ku5.t0) ku5.t0.f312615d).h(new ur1.o(i17, this, sceneSubPath), "BizPersonalDraftFile");
            return;
        }
        tk.s[] sVarArr = tk.s.f419870d;
        if (i18 == 2) {
            Di().remove("photo_picture_draft_key");
            return;
        }
        if (i17 == 1) {
            Di().remove("article_draft_key");
            return;
        }
        if (i17 == 2) {
            Di().remove("picture_draft_key");
        } else {
            if (i17 != 3) {
                return;
            }
            Di().remove("article_draft_key");
            Di().remove("picture_draft_key");
        }
    }

    public boolean Bi(int i17, java.lang.String sceneSubPath, int i18, com.tencent.wechat.mm.biz.h2 publishScene) {
        kotlin.jvm.internal.o.g(sceneSubPath, "sceneSubPath");
        kotlin.jvm.internal.o.g(publishScene, "publishScene");
        com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "draftExists draftType: " + i17 + ", scene: " + sceneSubPath + ", bizType: " + i18 + ", publishScene: " + publishScene);
        tk.r rVar = (tk.r) i95.n0.c(tk.r.class);
        if (i17 == 2) {
            if (((ox.z) rVar).Di(Ui(sceneSubPath), i18, publishScene)) {
                com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "draftExists in new image editor, scene: " + publishScene);
                return true;
            }
        }
        tk.s[] sVarArr = tk.s.f419870d;
        if (i18 == 2) {
            return Di().contains(Ni(i17, i18));
        }
        if (wi(sceneSubPath)) {
            boolean contains = Di().contains(Ni(i17, i18));
            com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "draftExists use mmkv, hasDraft: " + contains + ", scene: " + publishScene);
            return contains;
        }
        java.lang.String Ri = Ri(i17, sceneSubPath);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(Ri);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(Ri.concat("/LocalDraft"));
            java.lang.String str2 = a18.f213279f;
            if (str2 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
            if (!m18.a() ? false : m18.f213266a.F(m18.f213267b)) {
                com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "draftExists use file, hasDraft: true, scene: " + publishScene);
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "draftExists use file, hasDraft: false, scene: " + publishScene);
        return false;
    }

    public final com.tencent.mm.sdk.platformtools.o4 Di() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(gm0.m.i() + "_personal_center_draft_mmkv_name");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public final java.lang.String Ni(int i17, int i18) {
        tk.s[] sVarArr = tk.s.f419870d;
        return i18 == 2 ? "photo_picture_draft_key" : i17 == 1 ? "article_draft_key" : "picture_draft_key";
    }

    public final java.lang.String Ri(int i17, java.lang.String str) {
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(android.util.Base64.encodeToString(bytes, 10));
        com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "scenePath is " + a17);
        return f430372d + '/' + (i17 == 1 ? "Article" : "Picture") + '/' + a17;
    }

    public final java.lang.String Ui(java.lang.String draftScene) {
        kotlin.jvm.internal.o.g(draftScene, "draftScene");
        return ((draftScene.length() == 0) || u46.l.d("personalCenter", draftScene)) ? "" : draftScene;
    }

    public void Vi(int i17, java.lang.String sceneSubPath, int i18, yz5.l draftDataCallback) {
        kotlin.jvm.internal.o.g(sceneSubPath, "sceneSubPath");
        kotlin.jvm.internal.o.g(draftDataCallback, "draftDataCallback");
        com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "read draft draftType: " + i17 + ", scene: " + sceneSubPath + ", bizType: " + i18);
        tk.r rVar = (tk.r) i95.n0.c(tk.r.class);
        if (i17 == 2) {
            kotlin.jvm.internal.o.d(rVar);
            if (((ox.z) rVar).Di(Ui(sceneSubPath), i18, com.tencent.wechat.mm.biz.h2.PUBLISH_SCENE_UNKNOWN)) {
                com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "read draft in new image editor");
                java.lang.String Ui = Ui(sceneSubPath);
                final ur1.p pVar = new ur1.p(draftDataCallback);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishRichEditorService", "getDraftInNewImageEditor sceneSubPath: " + Ui + ", bizType: " + i18);
                com.tencent.wechat.iam.biz.o0.f217763b.c(Ui, i18, new com.tencent.wechat.iam.biz.n0(pVar) { // from class: ox.y

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ yz5.l f349537a;

                    {
                        kotlin.jvm.internal.o.g(pVar, "function");
                        this.f349537a = pVar;
                    }

                    @Override // com.tencent.wechat.iam.biz.n0
                    public final /* synthetic */ void a(java.lang.String str) {
                        this.f349537a.invoke(str);
                    }
                });
                return;
            }
        }
        Zi(i17, sceneSubPath, i18, draftDataCallback);
    }

    public void Zi(int i17, java.lang.String sceneSubPath, int i18, yz5.l draftDataCallback) {
        kotlin.jvm.internal.o.g(sceneSubPath, "sceneSubPath");
        kotlin.jvm.internal.o.g(draftDataCallback, "draftDataCallback");
        com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "readWebDraft draftType: " + i17 + ", scene: " + sceneSubPath + ", bizType: " + i18);
        if (!wi(sceneSubPath)) {
            ((ku5.t0) ku5.t0.f312615d).h(new ur1.q(Ri(i17, sceneSubPath), draftDataCallback), "BizPersonalDraftFile");
            return;
        }
        java.lang.String Ni = Ni(i17, i18);
        java.lang.String u17 = Di().u(Ni, "");
        com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "readWebDraft MMKV mmkvKey: " + Ni + ", contentLen: " + u17.length() + ", contentMd5: " + com.tencent.mm.sdk.platformtools.w2.a(u17) + ", contentPrefix: " + r26.p0.E0(u17, 200));
        draftDataCallback.invoke(u17);
    }

    public final boolean wi(java.lang.String str) {
        return (str.length() == 0) || u46.l.d("personalCenter", str);
    }
}
