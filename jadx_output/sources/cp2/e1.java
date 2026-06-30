package cp2;

/* loaded from: classes2.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f220791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f220792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f220793f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f220794g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(java.util.ArrayList arrayList, so2.j5 j5Var, androidx.recyclerview.widget.f2 f2Var, int i17) {
        super(0);
        this.f220791d = arrayList;
        this.f220792e = j5Var;
        this.f220793f = f2Var;
        this.f220794g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f220791d.remove(this.f220792e);
        this.f220793f.notifyItemRemoved(this.f220794g);
        return jz5.f0.f302826a;
    }
}
