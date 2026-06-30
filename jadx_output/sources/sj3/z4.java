package sj3;

/* loaded from: classes14.dex */
public class z4 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modeltalkroom.MultiTalkGroupMember f408818d;

    /* renamed from: e, reason: collision with root package name */
    public final int f408819e;

    public z4(sj3.a5 a5Var, com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember, int i17) {
        this.f408818d = multiTalkGroupMember;
        this.f408819e = i17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return java.lang.Integer.compare(this.f408819e, ((sj3.z4) obj).f408819e);
    }

    public java.lang.String toString() {
        return this.f408818d + ":" + this.f408819e;
    }
}
