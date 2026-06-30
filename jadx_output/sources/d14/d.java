package d14;

/* loaded from: classes11.dex */
public class d extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f225730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f225731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225732g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f225733h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f225734i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d14.f f225735m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d14.f fVar, int i17, r35.m3 m3Var, java.util.Map map, android.os.Bundle bundle, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.String str2, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f225735m = fVar;
        this.f225730e = map;
        this.f225731f = bundle;
        this.f225732g = str;
        this.f225733h = weakReference;
        this.f225734i = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        java.lang.String str;
        java.util.Map map;
        d14.f fVar = this.f225735m;
        fVar.getClass();
        int i17 = 0;
        while (true) {
            str = ".sysmsg.sysmsgtemplate.content_template.link_list.link";
            if (i17 != 0) {
                str = ".sysmsg.sysmsgtemplate.content_template.link_list.link" + i17;
            }
            map = this.f225730e;
            if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(str))) {
                str = null;
                break;
            }
            if (com.tencent.mm.sdk.platformtools.t8.D0((java.lang.String) map.get(str + ".$type"), "link_history")) {
                break;
            } else {
                i17++;
            }
        }
        android.os.Bundle bundle = this.f225731f;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f225732g, bundle.getLong("msg_id"));
        boolean z17 = (Li.F & 4096) > 0;
        java.lang.ref.WeakReference weakReference = this.f225733h;
        if (z17) {
            db5.e1.y((android.content.Context) weakReference.get(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.htv), "", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l_e), new d14.c(this));
        } else if (weakReference != null) {
            try {
                if (weakReference.get() != null) {
                    fVar.f225742f = bundle.getLong("msg_sever_id");
                    fVar.f225743g = bundle.getString("conv_talker_username");
                    fVar.f225744h = bundle.getString("send_msg_username");
                    long msgId = Li.getMsgId();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wcf://selectrecord/");
                    sg3.r.aj();
                    sb6.append(msgId);
                    java.lang.String sb7 = sb6.toString();
                    fVar.f225745i = sb7;
                    if (com.tencent.mm.vfs.w6.j(sb7)) {
                        d14.f.e(Li.getMsgId(), fVar.f225742f, fVar.f225744h, fVar.f225743g, new java.lang.String(com.tencent.mm.vfs.w6.N(fVar.f225745i, 0, -1)));
                    } else {
                        fVar.f225746m = true;
                        android.content.Context context = (android.content.Context) weakReference.get();
                        android.app.ProgressDialog progressDialog = fVar.f225741e;
                        if (progressDialog == null) {
                            fVar.f225741e = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490468vx), true, true, new d14.e(fVar));
                        } else if (!progressDialog.isShowing()) {
                            fVar.f225741e.show();
                        }
                        d14.f.h(Li, map, str, "tmpl_type_profilewithrevoke", fVar);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        java.lang.String string = bundle.getString("conv_talker_username", null);
        int i18 = com.tencent.mm.sdk.platformtools.t8.D0(bundle.getString("template_type"), "tmpl_type_profilewithrevoke") ^ true ? 2 : 1;
        long parseLong = java.lang.Long.parseLong(Li.Y1());
        com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryCheckStruct shareRoomHistoryCheckStruct = new com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryCheckStruct();
        shareRoomHistoryCheckStruct.f60346d = shareRoomHistoryCheckStruct.b("RoomId", string, true);
        shareRoomHistoryCheckStruct.f60347e = i18;
        shareRoomHistoryCheckStruct.f60348f = parseLong;
        shareRoomHistoryCheckStruct.n();
        shareRoomHistoryCheckStruct.k();
        ((ih3.e) ((tg3.k1) i95.n0.c(tg3.k1.class))).Di("link_history", this.f225730e, this.f225731f, this.f225733h, this.f225734i);
    }
}
