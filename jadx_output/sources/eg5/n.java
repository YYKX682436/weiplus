package eg5;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final eg5.n f252856a = new eg5.n();

    public final java.lang.String a(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        switch (i17) {
            case 1:
                java.lang.String string = context.getString(com.tencent.mm.R.string.f493790p31);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                return string;
            case 2:
                java.lang.String string2 = context.getString(com.tencent.mm.R.string.f493789p30);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                return string2;
            case 3:
                java.lang.String string3 = context.getString(com.tencent.mm.R.string.p3_);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                return string3;
            case 4:
                java.lang.String string4 = context.getString(com.tencent.mm.R.string.p39);
                kotlin.jvm.internal.o.f(string4, "getString(...)");
                return string4;
            case 5:
                java.lang.String string5 = context.getString(com.tencent.mm.R.string.f493795p36);
                kotlin.jvm.internal.o.f(string5, "getString(...)");
                return string5;
            case 6:
                java.lang.String string6 = context.getString(com.tencent.mm.R.string.p37);
                kotlin.jvm.internal.o.f(string6, "getString(...)");
                return string6;
            case 7:
                java.lang.String string7 = context.getString(com.tencent.mm.R.string.p38);
                kotlin.jvm.internal.o.f(string7, "getString(...)");
                return string7;
            case 8:
                java.lang.String string8 = context.getString(com.tencent.mm.R.string.p2y);
                kotlin.jvm.internal.o.f(string8, "getString(...)");
                return string8;
            case 9:
                java.lang.String string9 = context.getString(com.tencent.mm.R.string.f493792p33);
                kotlin.jvm.internal.o.f(string9, "getString(...)");
                return string9;
            case 10:
                java.lang.String string10 = context.getString(com.tencent.mm.R.string.f493793p34);
                kotlin.jvm.internal.o.f(string10, "getString(...)");
                return string10;
            case 11:
                java.lang.String string11 = context.getString(com.tencent.mm.R.string.p3a);
                kotlin.jvm.internal.o.f(string11, "getString(...)");
                return string11;
            case 12:
                java.lang.String string12 = context.getString(com.tencent.mm.R.string.f493791p32);
                kotlin.jvm.internal.o.f(string12, "getString(...)");
                return string12;
            case 13:
                java.lang.String string13 = context.getString(com.tencent.mm.R.string.p2z);
                kotlin.jvm.internal.o.f(string13, "getString(...)");
                return string13;
            case 14:
                java.lang.String string14 = context.getString(com.tencent.mm.R.string.fuw);
                kotlin.jvm.internal.o.f(string14, "getString(...)");
                return string14;
            default:
                return "";
        }
    }

    public final boolean b(b15.c cVar, java.lang.String str) {
        boolean z17 = kz5.n0.O(kz5.c0.i("1004", "1005", "1002"), cVar.w()) && !com.tencent.mm.sdk.platformtools.t8.K0(cVar.p());
        if (z17) {
            return z17 && (kotlin.jvm.internal.o.b(cVar.k(), c01.z1.r()) || (com.tencent.mm.storage.z3.R4(str) ^ true));
        }
        return false;
    }
}
