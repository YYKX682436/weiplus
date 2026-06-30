package dk2;

/* loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f233712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(java.lang.ref.WeakReference weakReference) {
        super(4);
        this.f233712d = weakReference;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        yz5.r rVar;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        r45.tp2 resp = (r45.tp2) obj4;
        kotlin.jvm.internal.o.g(resp, "resp");
        r45.zm6 zm6Var = (r45.zm6) resp.getCustom(7);
        boolean z17 = true;
        if (zm6Var != null && zm6Var.getBoolean(1)) {
            r45.zm6 zm6Var2 = (r45.zm6) resp.getCustom(7);
            java.lang.String string = zm6Var2 != null ? zm6Var2.getString(0) : null;
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                r45.zm6 zm6Var3 = (r45.zm6) resp.getCustom(7);
                db5.t7.makeText(context, zm6Var3 != null ? zm6Var3.getString(0) : null, 0).show();
            }
        }
        java.lang.ref.WeakReference weakReference = this.f233712d;
        if (weakReference != null && (rVar = (yz5.r) weakReference.get()) != null) {
            rVar.C(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), str, resp);
        }
        return jz5.f0.f302826a;
    }
}
