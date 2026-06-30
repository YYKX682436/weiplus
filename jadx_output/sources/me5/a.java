package me5;

/* loaded from: classes3.dex */
public final class a extends ih3.n {
    @Override // ih3.n
    public java.lang.String a() {
        return "link_ecs_gift";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map values, java.lang.String head, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(head, "head");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.neo);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String concat = head.concat(".ecsgift.orderid");
        if (values.get(concat) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SysMsgTemplateLinkHandlerEcsGift", "handleImp, get orderId failed");
            return string;
        }
        java.lang.String str = (java.lang.String) values.get(concat);
        java.lang.Object obj = (java.lang.String) values.get(head.concat(".ecsgift.scene"));
        if (obj == null) {
            obj = 1;
        }
        return "<_wc_custom_link_ color=\"#CCAB64\" href=\"weixin://ecsgift/orderid/" + str + "?scene=" + obj + "\">" + string + "</_wc_custom_link_>";
    }
}
