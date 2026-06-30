package vi2;

/* loaded from: classes10.dex */
public class h implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public vi2.g f437550d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.xn1 f437551e;

    public h(vi2.g inviteState, r45.xn1 contact) {
        kotlin.jvm.internal.o.g(inviteState, "inviteState");
        kotlin.jvm.internal.o.g(contact, "contact");
        this.f437550d = inviteState;
        this.f437551e = contact;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f437551e.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 4;
    }
}
