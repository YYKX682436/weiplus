package kv4;

/* loaded from: classes12.dex */
public final class l implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.a f312708a;

    /* renamed from: b, reason: collision with root package name */
    public final jv4.m f312709b;

    public l(mv4.a boxData) {
        kotlin.jvm.internal.o.g(boxData, "boxData");
        this.f312708a = boxData;
        this.f312709b = jv4.m.f302252r;
    }

    @Override // jv4.n
    public void c(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kv4.i iVar = holder instanceof kv4.i ? (kv4.i) holder : null;
        if (iVar == null) {
            return;
        }
        kv4.k kVar = new kv4.k(this);
        java.lang.Object value = ((jz5.n) ((qv4.b) iVar).f366958d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        kVar.invoke((android.view.View) value);
    }

    @Override // jv4.n
    public jv4.m getType() {
        return this.f312709b;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return "ai-search-" + ((rv4.a) this.f312708a).f400425b;
    }

    @Override // nv4.g
    public void w() {
        java.util.Iterator it = ((rv4.a) this.f312708a).f400424a.iterator();
        while (it.hasNext()) {
            ((rv4.b) ((mv4.b) it.next())).w();
        }
    }
}
