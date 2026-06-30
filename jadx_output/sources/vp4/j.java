package vp4;

/* loaded from: classes10.dex */
public final class j extends m55.b {

    /* renamed from: b, reason: collision with root package name */
    public final st3.r f439036b;

    /* renamed from: c, reason: collision with root package name */
    public final ct0.b f439037c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f439038d;

    /* renamed from: e, reason: collision with root package name */
    public rp4.a f439039e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f439040f;

    /* renamed from: g, reason: collision with root package name */
    public final ru3.f f439041g;

    /* renamed from: h, reason: collision with root package name */
    public final rp4.x f439042h;

    /* renamed from: i, reason: collision with root package name */
    public final st3.s f439043i;

    public j(st3.r encode, ct0.b bVar, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, rp4.a aVar, android.content.Context context, ru3.f fVar, rp4.x xVar, st3.s editConfig) {
        kotlin.jvm.internal.o.g(encode, "encode");
        kotlin.jvm.internal.o.g(editConfig, "editConfig");
        this.f439036b = encode;
        this.f439037c = bVar;
        this.f439038d = recordConfigProvider;
        this.f439039e = aVar;
        this.f439040f = context;
        this.f439041g = fVar;
        this.f439042h = xVar;
        this.f439043i = editConfig;
    }

    public static final void f(vp4.j jVar, boolean z17, boolean z18, java.lang.String str, int i17, st3.r rVar, int i18, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, rp4.x xVar, st3.s sVar, java.lang.String str2, yz5.p pVar) {
        boolean z19;
        rs0.q a17;
        jVar.getClass();
        r45.h70 f17 = vp4.s.f439074a.f(recordConfigProvider, sVar, xVar, z17, z18, str, i17);
        if (f17 == null) {
            pVar.invoke(java.lang.Boolean.FALSE, 1009);
            return;
        }
        dw3.k.f244219a.d(gm0.j1.u().h() + "mediaOpt/remux/tempVideo/");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().h() + "mediaOpt/remux/tempVideo/");
        sb6.append("sns_");
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoBackgroundRemuxChain", "create dir:" + sb7 + " result:" + com.tencent.mm.vfs.w6.u(sb7));
        java.util.LinkedList tracks = f17.f375897d;
        kotlin.jvm.internal.o.f(tracks, "tracks");
        java.util.Iterator it = tracks.iterator();
        while (true) {
            z19 = false;
            if (!it.hasNext()) {
                break;
            }
            r45.ho6 ho6Var = (r45.ho6) it.next();
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(ho6Var.f376333d);
            java.lang.String str3 = a18.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                }
            }
            java.lang.String str4 = a18.f213279f;
            int lastIndexOf = str4.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str4 = str4.substring(lastIndexOf + 1);
            }
            kotlin.jvm.internal.o.f(str4, "getName(...)");
            java.lang.String str5 = sb7 + '/' + str4;
            com.tencent.mm.vfs.w6.c(ho6Var.f376333d, str5);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoBackgroundRemuxChain", "file copy form:" + ho6Var.f376333d + " to:" + str5);
            ho6Var.f376333d = str5;
            if (xVar != null) {
                r45.vl5 cropRect = ho6Var.f376344r.f378527e;
                kotlin.jvm.internal.o.f(cropRect, "cropRect");
                android.graphics.Rect rect = xVar.f398704i;
                com.tencent.mm.plugin.vlog.model.x.g(rect, cropRect);
                r45.vl5 contentRect = ho6Var.f376344r.f378529g;
                kotlin.jvm.internal.o.f(contentRect, "contentRect");
                com.tencent.mm.plugin.vlog.model.x.g(rect, contentRect);
            }
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        try {
            h0Var.f310123d = f17.toByteArray();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            kotlin.jvm.internal.o.f(obtain, "obtain(...)");
            recordConfigProvider.f155676n.writeToParcel(obtain, 0);
            h0Var2.f310123d = obtain.marshall();
            obtain.recycle();
            vp4.a aVar = new vp4.a(pVar);
            zv3.c e17 = com.tencent.mm.plugin.vlog.model.x.e(f17);
            com.tencent.mm.xeffect.effect.EffectManager effectManager = new com.tencent.mm.xeffect.effect.EffectManager();
            ((zv3.f) e17).e();
            com.tencent.mm.plugin.vlog.model.h1 d17 = com.tencent.mm.plugin.vlog.model.x.d(f17, effectManager);
            d17.p(e17);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_finder_post_hdr_cover_color_correct, 1) == 1) {
                java.util.Iterator it6 = d17.f175597c.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) it6.next();
                    if (i1Var.f175617b == 2 && (a17 = rs0.r.f399316a.a(i1Var.f175616a)) != null) {
                        d17.b(a17.f399313b, a17.f399314c, a17.f399315d);
                    }
                }
            }
            d17.l(f17.f375902i.f376776e, new vp4.i(e17, effectManager, recordConfigProvider, aVar, f17, jVar));
            android.os.Bundle bundle = recordConfigProvider.M;
            if (bundle != null && bundle.getBoolean("key_save_composition_info")) {
                z19 = true;
            }
            if (z19) {
                ut3.f.f431176c.f431178b.putByteArray("key_composition_info", f17.toByteArray());
            }
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vp4.b(str2, recordConfigProvider, i17, i18, str, jVar, rVar, h0Var, h0Var2, f17, null), 3, null);
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoBackgroundRemuxChain", "parse byte error");
            pVar.invoke(java.lang.Boolean.FALSE, 1009);
        }
    }

    @Override // m55.b
    public java.lang.Object d(og3.d dVar, og3.e eVar, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new vp4.h(this, dVar, null), continuation);
    }
}
