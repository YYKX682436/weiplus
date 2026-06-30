package xx4;

/* loaded from: classes5.dex */
public final class b extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ehj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, blocks: (B:6:0x0023, B:9:0x002d, B:13:0x0038, B:14:0x004a, B:16:0x0053, B:17:0x005b, B:19:0x0064, B:20:0x0070, B:33:0x003e), top: B:5:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, blocks: (B:6:0x0023, B:9:0x002d, B:13:0x0038, B:14:0x004a, B:16:0x0053, B:17:0x005b, B:19:0x0064, B:20:0x0070, B:33:0x003e), top: B:5:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r0 = "KEY_JSON_STRING"
            java.lang.String r9 = r9.getStringExtra(r0)
            java.lang.String r0 = ""
            if (r9 != 0) goto Lf
            r9 = r0
        Lf:
            java.lang.Class<zy2.b6> r1 = zy2.b6.class
            i95.m r1 = i95.n0.c(r1)
            zy2.b6 r1 = (zy2.b6) r1
            r1.getClass()
            android.app.Activity r3 = r8.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.o.g(r3, r1)
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L8a
            cl0.g r1 = new cl0.g     // Catch: java.lang.Throwable -> L8a
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r9 = "enterScene"
            r2 = 1
            boolean r4 = r1.has(r9)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L8a
            if (r4 != r2) goto L35
            r4 = r2
            goto L36
        L35:
            r4 = 0
        L36:
            if (r4 == 0) goto L48
            int r9 = r1.getInt(r9)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L8a
            goto L4a
        L3d:
            r9 = move-exception
            java.lang.String r4 = "safeGetInt"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L8a
            com.tencent.mm.sdk.platformtools.Log.a(r4, r0, r9)     // Catch: java.lang.Throwable -> L8a
        L48:
            r9 = 18
        L4a:
            java.lang.String r0 = "templateInfo"
            cl0.g r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L5a
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.optString(r1)     // Catch: java.lang.Throwable -> L8a
            goto L5b
        L5a:
            r0 = 0
        L5b:
            qs2.e r4 = new qs2.e     // Catch: java.lang.Throwable -> L8a
            r1 = 19
            r4.<init>(r2, r9, r1)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L70
            r45.rz6 r9 = new r45.rz6     // Catch: java.lang.Throwable -> L8a
            r9.<init>()     // Catch: java.lang.Throwable -> L8a
            r9.f385320d = r0     // Catch: java.lang.Throwable -> L8a
            r0 = 3
            r9.f385321e = r0     // Catch: java.lang.Throwable -> L8a
            r4.f366267i = r9     // Catch: java.lang.Throwable -> L8a
        L70:
            java.lang.Class<w40.e> r9 = w40.e.class
            i95.m r9 = i95.n0.c(r9)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = "getService(...)"
            kotlin.jvm.internal.o.f(r9, r0)     // Catch: java.lang.Throwable -> L8a
            r2 = r9
            w40.e r2 = (w40.e) r2     // Catch: java.lang.Throwable -> L8a
            r5 = 0
            r6 = 4
            r7 = 0
            w40.e.Df(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8a
            jz5.f0 r9 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L8a
            kotlin.Result.m521constructorimpl(r9)     // Catch: java.lang.Throwable -> L8a
            goto L94
        L8a:
            r9 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            kotlin.Result.m521constructorimpl(r9)
        L94:
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r9 = r8.P6()
            if (r9 == 0) goto L9d
            r9.finish()
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xx4.b.onCreate(android.os.Bundle):void");
    }
}
