package ir;

/* loaded from: classes12.dex */
public final class a1 extends ir.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final gr.c0 f293814b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f293815c;

    /* renamed from: d, reason: collision with root package name */
    public final int f293816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(gr.c0 smileyInfo, boolean z17, int i17) {
        super(1);
        kotlin.jvm.internal.o.g(smileyInfo, "smileyInfo");
        this.f293814b = smileyInfo;
        this.f293815c = z17;
        this.f293816d = i17;
    }

    @Override // ir.u0
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof ir.a1)) {
            ir.a1 a1Var = (ir.a1) obj;
            if (a1Var.f293815c == this.f293815c && kotlin.jvm.internal.o.b(a1Var.f293814b.f274663a, this.f293814b.f274663a)) {
                return true;
            }
        }
        return false;
    }
}
