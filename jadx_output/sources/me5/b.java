package me5;

/* loaded from: classes4.dex */
public final class b extends ih3.n {
    @Override // ih3.n
    public java.lang.String a() {
        return "link_ecs_img";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map values, java.lang.String head, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        int i17;
        java.lang.Integer h17;
        java.lang.Integer h18;
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(head, "head");
        java.lang.String str = (java.lang.String) values.get(head.concat(".type"));
        if (str == null || (h18 = r26.h0.h(str)) == null) {
            int i18 = i20.b.f287869a;
            i17 = 1;
        } else {
            i17 = h18.intValue();
        }
        int i19 = i20.b.f287869a;
        java.lang.String str2 = "";
        if (i17 == 1) {
            java.lang.String str3 = (java.lang.String) values.get(head.concat(".res_enum"));
            int intValue = (str3 == null || (h17 = r26.h0.h(str3)) == null) ? 0 : h17.intValue();
            int i27 = i20.a.f287868a;
            if (intValue != 1 && intValue == 2) {
                str2 = "<img src=\"systemmessages_ecsgifticon.png\"/>";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SysMsgTemplateLinkHandlerEcsImg", "handleImp local, enum: " + intValue + ", src: " + str2);
        }
        return str2;
    }
}
