package if4;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f291253a;

    /* renamed from: b, reason: collision with root package name */
    public final long f291254b;

    /* renamed from: c, reason: collision with root package name */
    public final int f291255c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f291256d;

    /* renamed from: e, reason: collision with root package name */
    public final if4.i f291257e;

    /* renamed from: f, reason: collision with root package name */
    public r45.xe6 f291258f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f291259g;

    public h(int i17, long j17, int i18, java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f291253a = i17;
        this.f291254b = j17;
        this.f291255c = i18;
        this.f291256d = username;
        this.f291257e = if4.i.f291262f;
        r45.xe6 xe6Var = new r45.xe6();
        xe6Var.f390023f = "";
        xe6Var.f390025h = "";
        xe6Var.f390021d = "";
        this.f291258f = xe6Var;
        this.f291259g = "";
    }

    public final boolean a() {
        return this.f291257e == if4.i.f291261e;
    }

    public final boolean b() {
        a();
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryVideoItem", "item" + this.f291259g + " is not fake isVLogFakeVideo");
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof if4.h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if4.i iVar = if4.i.f291260d;
        if4.i iVar2 = this.f291257e;
        if (iVar2 == iVar && ((if4.h) obj).f291257e == iVar) {
            return true;
        }
        if (a()) {
            if4.h hVar = (if4.h) obj;
            if (hVar.a() && com.tencent.mm.sdk.platformtools.t8.D0(this.f291259g, hVar.f291259g)) {
                return true;
            }
        }
        if4.i iVar3 = if4.i.f291262f;
        if (iVar2 == iVar3) {
            if4.h hVar2 = (if4.h) obj;
            hVar2.getClass();
            if ((hVar2.f291257e == iVar3) && this.f291253a == hVar2.f291253a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public java.lang.String toString() {
        return "[VideoItem=" + super.hashCode() + ",localId=:" + this.f291253a + ",storyId=" + this.f291254b + ",videoType:=" + this.f291257e + ", username=" + this.f291256d + ", url=" + this.f291258f.f390023f + ']';
    }
}
