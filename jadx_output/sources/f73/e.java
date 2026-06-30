package f73;

/* loaded from: classes15.dex */
public final class e extends f73.g {
    @Override // f73.g, f73.a
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        super.b(tag, parser);
    }

    @Override // f73.g
    public com.tencent.mm.plugin.handoff.model.HandOff h() {
        return new com.tencent.mm.plugin.handoff.model.HandOffMP();
    }
}
