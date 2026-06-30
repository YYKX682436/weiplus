package xj5;

/* loaded from: classes9.dex */
public final class h extends xj5.a {

    /* renamed from: u, reason: collision with root package name */
    public final r45.i67 f454905u;

    public h(r45.i67 record, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(record, "record");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f454905u = record;
    }

    @Override // xj5.a
    public int c() {
        return 9;
    }

    @Override // xj5.a
    public boolean d(xj5.a aVar) {
        xj5.h other = (xj5.h) aVar;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this.f454905u.f376769d, other.f454905u.f376769d);
    }

    @Override // in5.c
    public long getItemId() {
        java.lang.String msg_svrId = this.f454905u.f376769d;
        kotlin.jvm.internal.o.f(msg_svrId, "msg_svrId");
        return java.lang.Long.parseLong(msg_svrId);
    }

    @Override // in5.c
    public int h() {
        return xj5.a.f454886h;
    }

    @Override // xj5.e
    public int m(java.lang.Object obj) {
        xj5.h other = (xj5.h) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }
}
