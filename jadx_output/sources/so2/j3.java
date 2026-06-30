package so2;

/* loaded from: classes2.dex */
public final class j3 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.yf2 f410441d;

    /* renamed from: e, reason: collision with root package name */
    public oc2.k f410442e;

    public j3(r45.yf2 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        this.f410441d = contact;
    }

    public final boolean a() {
        return this.f410441d.f391037g * ((long) 1000) < c01.id.c();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String username;
        java.lang.String str;
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof so2.j3) || (finderContact = ((so2.j3) obj).f410441d.f391034d) == null || (username = finderContact.getUsername()) == null) {
            return -1;
        }
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = this.f410441d.f391034d;
        if (finderContact2 == null || (str = finderContact2.getUsername()) == null) {
            str = "";
        }
        return username.compareTo(str);
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return so2.j3.class.getName().hashCode();
    }
}
