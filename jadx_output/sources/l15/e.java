package l15;

/* loaded from: classes5.dex */
public class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f315014d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "usedefaultthumb"), com.tencent.mm.protobuf.i.i(-1, "isupdatetitle"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.i(-1, "isupdatedesc"), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.i(-1, "ishiddentail")});
        this.f315014d = appendAttrs;
        super.set__serialName("appMsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, null, 0, null, 0});
    }

    public int j() {
        return super.getInteger(this.f315014d + 5);
    }

    public int k() {
        return super.getInteger(this.f315014d + 0);
    }
}
