package kn4;

/* loaded from: classes12.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f309672a;

    /* renamed from: b, reason: collision with root package name */
    public long f309673b;

    /* renamed from: c, reason: collision with root package name */
    public long f309674c;

    public java.lang.Object clone() {
        kn4.b0 b0Var = new kn4.b0();
        b0Var.f309672a = this.f309672a;
        b0Var.f309673b = this.f309673b;
        b0Var.f309674c = this.f309674c;
        return b0Var;
    }

    public java.lang.String toString() {
        return "UIObject{ui='" + this.f309672a + "', duration=" + (this.f309674c - this.f309673b) + '}';
    }
}
