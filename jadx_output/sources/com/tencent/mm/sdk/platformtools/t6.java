package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class t6 extends com.tencent.mm.sdk.platformtools.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.y6 f192985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f192987c;

    public t6(com.tencent.mm.sdk.platformtools.y6 y6Var, java.lang.String str, android.content.Context context) {
        this.f192985a = y6Var;
        this.f192986b = str;
        this.f192987c = context;
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void a(com.tencent.mm.sdk.platformtools.a7 a7Var) {
        java.lang.String str = "/" + this.f192987c.getPackageName() + "/";
        java.lang.String str2 = this.f192986b;
        if (str2.contains(str)) {
            b(new com.tencent.mm.sdk.platformtools.z6(str2));
        } else {
            super.a(a7Var);
            this.f192985a.a(a7Var);
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void b(com.tencent.mm.sdk.platformtools.a7 a7Var) {
        this.f192985a.b(a7Var);
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public boolean c() {
        return true;
    }
}
