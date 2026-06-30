package r15;

/* loaded from: classes9.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368642d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_ID), com.tencent.mm.protobuf.i.i(-1, "count"), com.tencent.mm.protobuf.i.i(-1, "type")});
        this.f368642d = appendAttrs;
        super.set__serialName("groupinfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, 0, 0});
    }

    public int getCount() {
        return super.getInteger(this.f368642d + 1);
    }

    public java.lang.String getId() {
        return super.getString(this.f368642d + 0);
    }

    public void j(int i17) {
        super.set(this.f368642d + 1, java.lang.Integer.valueOf(i17));
    }

    public void k(java.lang.String str) {
        super.set(this.f368642d + 0, str);
    }

    public void l(int i17) {
        super.set(this.f368642d + 2, java.lang.Integer.valueOf(i17));
    }
}
