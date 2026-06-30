package qa3;

/* loaded from: classes15.dex */
public final class p implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa3.s f361058a;

    public p(qa3.s sVar) {
        this.f361058a = sVar;
    }

    @Override // q80.f0
    public void fail() {
        qa3.o.f361051a.c(this.f361058a.f361035a, false, "start fail");
    }

    @Override // q80.f0
    public void success() {
        qa3.o.f361051a.c(this.f361058a.f361035a, true, "");
    }
}
