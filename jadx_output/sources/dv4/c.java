package dv4;

/* loaded from: classes.dex */
public class c extends dv4.a {

    /* renamed from: c, reason: collision with root package name */
    public boolean f244001c;

    public c(java.lang.String str) {
        super(str, Integer.MAX_VALUE);
        this.f244001c = false;
    }

    @Override // dv4.a
    public void a(java.util.List list) {
        this.f244001c = !list.isEmpty();
    }
}
