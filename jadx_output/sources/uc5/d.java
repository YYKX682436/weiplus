package uc5;

/* loaded from: classes10.dex */
public abstract class d extends xm3.a {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.regex.Pattern f426475g;

    /* renamed from: d, reason: collision with root package name */
    public uc5.c f426476d;

    /* renamed from: e, reason: collision with root package name */
    public uc5.r0 f426477e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f426478f;

    static {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[._a-zA-Z0-9]+");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        f426475g = compile;
    }

    public d(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f426476d = uc5.a.f426469a;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        uc5.d other = (uc5.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return compareTo(other) == 0 && kotlin.jvm.internal.o.b(this.f426476d, other.f426476d);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // xm3.a, in5.c
    public int h() {
        return getClass().getName().hashCode();
    }

    @Override // xm3.a, xm3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public uc5.d y0() {
        java.lang.Object newInstance = getClass().getConstructor(com.tencent.mm.storage.f9.class).newInstance(p());
        kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type Item of com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryBaseItem");
        uc5.d dVar = (uc5.d) newInstance;
        uc5.c cVar = this.f426476d;
        uc5.c cVar2 = uc5.a.f426469a;
        if (!kotlin.jvm.internal.o.b(cVar, cVar2)) {
            if (!(cVar instanceof uc5.b)) {
                throw new jz5.j();
            }
            cVar2 = new uc5.b(((uc5.b) cVar).f426471a);
        }
        dVar.f426476d = cVar2;
        dVar.f426477e = this.f426477e;
        return dVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(uc5.d other) {
        kotlin.jvm.internal.o.g(other, "other");
        int j17 = kotlin.jvm.internal.o.j(other.p().T1(), p().T1());
        return j17 != 0 ? j17 : kotlin.jvm.internal.o.j(other.p().getMsgId(), p().getMsgId());
    }

    public abstract com.tencent.mm.storage.f9 p();

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String str = this.f426478f;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = p().Q0() + '#' + p().getMsgId();
        this.f426478f = str2;
        return str2;
    }
}
