package vr3;

/* loaded from: classes11.dex */
public final class b0 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.mm f439623d;

    public b0(r45.mm serviceInfo) {
        kotlin.jvm.internal.o.g(serviceInfo, "serviceInfo");
        this.f439623d = serviceInfo;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f439623d.f380638g.hashCode();
    }

    @Override // in5.c
    public int h() {
        return this.f439623d.f380636e;
    }
}
