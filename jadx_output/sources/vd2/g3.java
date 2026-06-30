package vd2;

/* loaded from: classes3.dex */
public final class g3 implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f435736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435737b;

    public g3(r45.h32 h32Var, android.content.Context context) {
        this.f435736a = h32Var;
        this.f435737b = context;
    }

    @Override // i50.n
    public void a(boolean z17) {
        r45.q65 q65Var;
        boolean z18 = false;
        r45.h32 h32Var = this.f435736a;
        if (h32Var != null && (q65Var = (r45.q65) h32Var.getCustom(10)) != null && q65Var.getBoolean(0)) {
            z18 = true;
        }
        android.content.Context context = this.f435737b;
        java.lang.String string = z18 ? context.getString(com.tencent.mm.R.string.e0k) : context.getString(com.tencent.mm.R.string.e0j);
        kotlin.jvm.internal.o.d(string);
        db5.t7.m(context, string);
    }
}
