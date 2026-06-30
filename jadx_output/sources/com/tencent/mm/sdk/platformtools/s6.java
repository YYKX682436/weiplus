package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class s6 extends com.tencent.mm.sdk.platformtools.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.y6 f192968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f192970c;

    public s6(com.tencent.mm.sdk.platformtools.y6 y6Var, java.lang.String str, android.content.Context context) {
        this.f192968a = y6Var;
        this.f192969b = str;
        this.f192970c = context;
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void a(com.tencent.mm.sdk.platformtools.a7 a7Var) {
        java.lang.String str = "/" + this.f192970c.getPackageName() + "/";
        java.lang.String str2 = this.f192969b;
        if (str2.contains(str)) {
            b(new com.tencent.mm.sdk.platformtools.z6(str2));
        } else {
            super.a(a7Var);
            this.f192968a.a(a7Var);
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void b(com.tencent.mm.sdk.platformtools.a7 a7Var) {
        this.f192968a.b(a7Var);
    }
}
