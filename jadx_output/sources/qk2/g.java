package qk2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f364433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.view.MenuItem menuItem) {
        super(2);
        this.f364433d = menuItem;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.extension.reddot.a result = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(result, "result");
        boolean z17 = result.f105327a;
        android.view.MenuItem menuItem = this.f364433d;
        if (z17) {
            r45.f03 f03Var = result.f105328b;
            if (!(f03Var != null && f03Var.f373887d == 6) || booleanValue) {
                db5.h4 h4Var = (db5.h4) menuItem;
                h4Var.f228363d = false;
                h4Var.f228364e = true;
            } else {
                db5.h4 h4Var2 = (db5.h4) menuItem;
                h4Var2.f228363d = true;
                h4Var2.f228364e = false;
            }
        } else {
            db5.h4 h4Var3 = (db5.h4) menuItem;
            h4Var3.f228363d = false;
            h4Var3.f228364e = false;
        }
        return jz5.f0.f302826a;
    }
}
