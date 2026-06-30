package df2;

/* loaded from: classes3.dex */
public final class kc implements if2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.tc f230568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yg2.b f230569b;

    public kc(df2.tc tcVar, yg2.b bVar) {
        this.f230568a = tcVar;
        this.f230569b = bVar;
    }

    @Override // if2.l0
    public java.util.List a() {
        return kz5.p0.f313996d;
    }

    @Override // if2.l0
    public java.util.List b() {
        return kz5.p0.f313996d;
    }

    @Override // if2.l0
    public void c(boolean z17) {
        df2.tc tcVar = this.f230568a;
        if (z17) {
            java.util.Iterator it = ((java.util.LinkedHashMap) tcVar.f231433n).entrySet().iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.live.widget.sl) ((java.util.Map.Entry) it.next()).getValue()).dismiss();
            }
        } else {
            java.util.Iterator it6 = ((java.util.LinkedHashMap) tcVar.f231433n).entrySet().iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.finder.live.widget.sl) ((java.util.Map.Entry) it6.next()).getValue()).d(this.f230569b);
            }
        }
    }

    @Override // if2.l0
    public void d(boolean z17) {
    }
}
