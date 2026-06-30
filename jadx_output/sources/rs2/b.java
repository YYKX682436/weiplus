package rs2;

/* loaded from: classes2.dex */
public final class b extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public final int f399324l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String title) {
        super(title);
        kotlin.jvm.internal.o.g(title, "title");
        this.f399324l = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.tencent.mm.R.layout.b39;
    }

    @Override // zx2.i
    public int[] b() {
        return new int[]{0, 24};
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        if (viewGroup != null) {
            viewGroup.setPadding(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16), 0, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16), 0);
        }
    }

    @Override // zx2.c
    public int[] n() {
        int i17 = this.f399324l;
        return new int[]{i17, i17};
    }
}
