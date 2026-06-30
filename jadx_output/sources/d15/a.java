package d15;

/* loaded from: classes9.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f225747d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "display_name"), com.tencent.mm.protobuf.i.u(-1, "icon_url"), com.tencent.mm.protobuf.i.i(-1, "schedule_showall"), com.tencent.mm.protobuf.i.i(-1, "schedule_remindsubtype"), com.tencent.mm.protobuf.i.u(-1, "schedule_username"), com.tencent.mm.protobuf.i.n(-1, "schedule_messvrid"), com.tencent.mm.protobuf.i.n(-1, "schedule_sourceid"), com.tencent.mm.protobuf.i.u(-1, "schedule_content"), com.tencent.mm.protobuf.i.u(-1, "schedule_time"), com.tencent.mm.protobuf.i.u(-1, "schedule_nickname")});
        this.f225747d = appendAttrs;
        super.set__serialName("mmschedule");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, 0, 0, null, null, null, null, null, null});
    }

    public java.lang.String j() {
        return super.getString(this.f225747d + 7);
    }

    public java.lang.Long k() {
        return super.getLongWrapper(this.f225747d + 5);
    }

    public java.lang.String l() {
        return super.getString(this.f225747d + 8);
    }

    public java.lang.String n() {
        return super.getString(this.f225747d + 4);
    }

    @Override // e14.l
    public boolean processXmlValueUseCData(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        return !kotlin.jvm.internal.o.b(tagName, "schedule_showall");
    }
}
