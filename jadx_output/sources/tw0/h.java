package tw0;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422434d;

    /* renamed from: e, reason: collision with root package name */
    public int f422435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zu0.l f422436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(zu0.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422436f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tw0.h(this.f422436f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tw0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f422435e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zu0.l lVar = this.f422436f;
            this.f422434d = lVar;
            this.f422435e = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.q7.c("MaasCache") + "/MovieComposing/", "snapshotImageData");
            if (!r6Var.m()) {
                r6Var.J();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lVar.f475683a);
            sb6.append('_');
            sb6.append(java.lang.System.currentTimeMillis());
            byte[] bytes = sb6.toString().getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, kk.k.g(bytes) + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
            java.lang.String o17 = r6Var2.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            android.graphics.Bitmap bitmap = lVar.f475684b;
            kotlin.jvm.internal.o.g(bitmap, "<this>");
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, o17, true);
            jz5.g gVar = by0.p.f36346a;
            java.lang.String o18 = r6Var2.o();
            kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
            tw0.g gVar2 = new tw0.g(nVar);
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(o18);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
                dn.m mVar = new dn.m();
                mVar.f241785d = "task_FinderUploadTask_2";
                mVar.f241787f = gVar2;
                char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(o18.getBytes());
                kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
                mVar.field_mediaId = "upload_".concat(b17);
                mVar.field_fullpath = o18;
                mVar.field_thumbpath = o18;
                mVar.field_talker = "";
                mVar.field_needStorage = true;
                mVar.field_fileType = 20304;
                mVar.field_appType = 251;
                mVar.field_bzScene = 2;
                mVar.A = 120;
                mVar.B = 300;
                mVar.field_priority = 2;
                ((rx.l) ((sx.e0) ((jz5.n) by0.p.f36346a).getValue())).Bi(mVar);
            }
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
