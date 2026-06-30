package ij5;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f291775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ij5.t f291776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity appCompatActivity, ij5.t tVar) {
        super(0);
        this.f291775d = appCompatActivity;
        this.f291776e = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f291775d;
        ij5.t tVar = this.f291776e;
        java.util.HashSet hashSet = (java.util.HashSet) ((jz5.n) tVar.f291805m).getValue();
        java.util.List list = (java.util.List) ((jz5.n) tVar.f291802g).getValue();
        java.lang.String str = (java.lang.String) ((jz5.n) tVar.f291801f).getValue();
        kotlin.jvm.internal.o.f(str, "access$getSelectShowHeadDisplay(...)");
        java.lang.String str2 = (java.lang.String) ((jz5.n) tVar.f291800e).getValue();
        kotlin.jvm.internal.o.f(str2, "access$getChatroomSessionWord(...)");
        return new qi5.b0(appCompatActivity, hashSet, list, str, str2, ((java.lang.Boolean) ((jz5.n) tVar.f291804i).getValue()).booleanValue());
    }
}
