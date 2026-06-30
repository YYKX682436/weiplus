package or;

/* loaded from: classes10.dex */
public abstract class d {
    public static final void a(java.lang.String str, int i17, int i18, java.lang.Integer num, int i19, java.lang.String extraInfo) {
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.EmoticonCustomCreateResultStruct emoticonCustomCreateResultStruct = new com.tencent.mm.autogen.mmdata.rpt.EmoticonCustomCreateResultStruct();
        emoticonCustomCreateResultStruct.f56019d = emoticonCustomCreateResultStruct.b("EditStickerSessionID", str, true);
        emoticonCustomCreateResultStruct.f56020e = i17;
        emoticonCustomCreateResultStruct.f56021f = i18;
        if (num != null) {
            emoticonCustomCreateResultStruct.f56022g = num.intValue();
        }
        emoticonCustomCreateResultStruct.f56023h = i19;
        emoticonCustomCreateResultStruct.f56024i = emoticonCustomCreateResultStruct.b("ExtraInfo", extraInfo, true);
        emoticonCustomCreateResultStruct.k();
    }

    public static final void b(java.lang.String str, int i17, int i18, java.lang.Integer num, java.lang.String extraInfo) {
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        c(str, i17, i18, num, 0, extraInfo, 16, null);
    }

    public static /* synthetic */ void c(java.lang.String str, int i17, int i18, java.lang.Integer num, int i19, java.lang.String str2, int i27, java.lang.Object obj) {
        if ((i27 & 8) != 0) {
            num = null;
        }
        java.lang.Integer num2 = num;
        if ((i27 & 16) != 0) {
            i19 = 20;
        }
        a(str, i17, i18, num2, i19, str2);
    }
}
