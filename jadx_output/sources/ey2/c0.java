package ey2;

/* loaded from: classes2.dex */
public final class c0 extends pf5.o0 implements xy2.g {

    /* renamed from: e, reason: collision with root package name */
    public bw5.a00 f257329e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yp2 f257330f;

    public void N6(r45.xb1 resp) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.protobuf.g byteString2;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList list = resp.getList(30);
        kotlin.jvm.internal.o.f(list, "getFinder_config_item(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (kotlin.jvm.internal.o.b(((r45.yy0) obj2).getString(0), "finder_video_template_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj2;
        if (yy0Var != null && (byteString2 = yy0Var.getByteString(1)) != null) {
            com.tencent.mars.xlog.Log.i("FinderFeedPostConfigVM", "[initVideoTemplateConfig]");
            bw5.a00 a00Var = new bw5.a00();
            a00Var.parseFrom(byteString2.g());
            this.f257329e = a00Var;
        }
        java.util.LinkedList list2 = resp.getList(30);
        kotlin.jvm.internal.o.f(list2, "getFinder_config_item(...)");
        java.util.Iterator it6 = list2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (kotlin.jvm.internal.o.b(((r45.yy0) next).getString(0), "post_mandatory_declare_config")) {
                obj = next;
                break;
            }
        }
        r45.yy0 yy0Var2 = (r45.yy0) obj;
        if (yy0Var2 == null || (byteString = yy0Var2.getByteString(1)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderFeedPostConfigVM", "[initMandatorDeclareConfig]");
        r45.yp2 yp2Var = new r45.yp2();
        yp2Var.parseFrom(byteString.g());
        this.f257330f = yp2Var;
    }
}
