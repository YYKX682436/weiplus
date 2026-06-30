package re5;

/* loaded from: classes12.dex */
public final class t extends ai5.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f394598e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f394599f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f394600g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String filePath, java.lang.String fileName) {
        super(new r45.gp0(), 0L, "", new hu.f());
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        this.f394598e = filePath;
        this.f394599f = fileName;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f394600g = uuid;
    }

    @Override // mf3.k
    public gg3.c a() {
        return new gg3.c(getId(), "", this.f394598e, this.f394599f, this.f5207a.f375448y * 1000, false, 32, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    @Override // ai5.c
    public tt.h d() {
        return null;
    }

    @Override // mf3.k
    public sf3.g e() {
        return null;
    }

    @Override // ai5.c, mf3.k
    public java.lang.String getId() {
        return "local.video@" + this.f394600g;
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326124f;
    }

    @Override // ai5.c
    public tt.h i() {
        return null;
    }
}
