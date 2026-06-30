package s14;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f402140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI f402141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.HashMap hashMap, com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI baseSettingPermissionUI) {
        super(1);
        this.f402140d = hashMap;
        this.f402141e = baseSettingPermissionUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r0.contains(r7.getBusiness()) == true) goto L13;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            android.view.View r7 = (android.view.View) r7
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.g(r7, r0)
            boolean r0 = r7 instanceof com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView
            if (r0 == 0) goto Le
            com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView r7 = (com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView) r7
            goto Lf
        Le:
            r7 = 0
        Lf:
            if (r7 == 0) goto L94
            java.lang.String r0 = r7.getPermission()
            java.util.HashMap r1 = r6.f402140d
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.String r2 = r7.getBusiness()
            boolean r0 = r0.contains(r2)
            r2 = 1
            if (r0 != r2) goto L2c
            goto L2d
        L2c:
            r2 = r1
        L2d:
            com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI r0 = r6.f402141e
            java.lang.String r0 = r0.f161437d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "check permission:"
            r3.<init>(r4)
            java.lang.String r4 = r7.getPermission()
            r3.append(r4)
            java.lang.String r4 = ", business:"
            r3.append(r4)
            java.lang.String r5 = r7.getBusiness()
            r3.append(r5)
            java.lang.String r5 = ", ifInControl:"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.mars.xlog.Log.i(r0, r3)
            if (r2 != 0) goto L91
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z.f193105a
            boolean r0 = z65.c.a()
            if (r0 != 0) goto L6a
            r0 = 8
            r7.setVisibility(r0)
            goto L94
        L6a:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "permission:"
            r1.<init>(r2)
            java.lang.String r2 = r7.getPermission()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r7 = r7.getBusiness()
            r1.append(r7)
            java.lang.String r7 = " is not in controlSwitchMap"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L91:
            r7.setVisibility(r1)
        L94:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s14.a.invoke(java.lang.Object):java.lang.Object");
    }
}
