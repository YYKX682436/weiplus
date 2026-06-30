package r15;

/* loaded from: classes12.dex */
public abstract class c {
    public static final void a(r15.b bVar, org.xmlpull.v1.XmlSerializer serializer) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        kotlin.jvm.internal.o.g(serializer, "serializer");
        r15.i n17 = bVar.n();
        if (n17 == null) {
            return;
        }
        serializer.startTag(null, "extcommoninfo");
        serializer.startTag(null, "refermsg");
        serializer.startTag(null, "svrid");
        serializer.text(n17.l() + "");
        serializer.endTag(null, "svrid");
        serializer.startTag(null, "signature");
        serializer.text(n17.getSignature());
        serializer.endTag(null, "signature");
        serializer.startTag(null, "strid");
        serializer.text(n17.k());
        serializer.endTag(null, "strid");
        serializer.startTag(null, "createtime");
        serializer.text(n17.getCreateTime() + "");
        serializer.endTag(null, "createtime");
        serializer.endTag(null, "refermsg");
        serializer.endTag(null, "extcommoninfo");
    }
}
