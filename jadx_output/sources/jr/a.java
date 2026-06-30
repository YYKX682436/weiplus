package jr;

/* loaded from: classes12.dex */
public abstract class a implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final im5.b f301284d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f301285e = true;

    public a(im5.b bVar) {
        this.f301284d = bVar;
        if (bVar != null) {
            bVar.keep(this);
        }
    }

    @Override // im5.a
    public void dead() {
        this.f301285e = false;
    }
}
