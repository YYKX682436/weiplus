package k75;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public k75.c f304826a;

    /* renamed from: b, reason: collision with root package name */
    public k75.i f304827b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f304828c;

    public i(k75.j jVar, k75.d dVar) {
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state=");
        sb6.append(this.f304826a.getName());
        sb6.append(",active=");
        sb6.append(this.f304828c);
        sb6.append(",parent=");
        k75.i iVar = this.f304827b;
        sb6.append(iVar == null ? "null" : iVar.f304826a.getName());
        return sb6.toString();
    }
}
