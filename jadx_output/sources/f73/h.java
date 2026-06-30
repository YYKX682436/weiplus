package f73;

/* loaded from: classes15.dex */
public final class h extends f73.g {
    @Override // f73.g, f73.a
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        switch (tag.hashCode()) {
            case -103833126:
                if (tag.equals("handofftype")) {
                    java.lang.String f17 = f(parser);
                    ((com.tencent.mm.plugin.handoff.model.HandOffURL) g()).setHandOffType(f17.length() == 0 ? 0 : java.lang.Integer.parseInt(f17));
                    break;
                }
                break;
            case 116079:
                if (tag.equals("url")) {
                    ((com.tencent.mm.plugin.handoff.model.HandOffURL) g()).setUrl(f(parser));
                    break;
                }
                break;
            case 3226745:
                if (tag.equals("icon")) {
                    ((com.tencent.mm.plugin.handoff.model.HandOffURL) g()).setIcon(f(parser));
                    break;
                }
                break;
            case 110371416:
                if (tag.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                    ((com.tencent.mm.plugin.handoff.model.HandOffURL) g()).setTitle(f(parser));
                    break;
                }
                break;
        }
        super.b(tag, parser);
    }

    @Override // f73.g
    public com.tencent.mm.plugin.handoff.model.HandOff h() {
        return new com.tencent.mm.plugin.handoff.model.HandOffURL();
    }
}
