package ot1;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final ot1.c f348830d = new ot1.c();

    public c() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ot1.h listFileIndies = (ot1.h) obj;
        java.lang.String typeStr = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(listFileIndies, "$this$listFileIndies");
        kotlin.jvm.internal.o.g((com.tencent.mm.vfs.x1) obj2, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(typeStr, "typeStr");
        listFileIndies.field_msgType = 43;
        if (!kotlin.jvm.internal.o.b(typeStr, ya.b.ORIGIN)) {
            return java.lang.Boolean.FALSE;
        }
        listFileIndies.field_msgSubType = 3;
        return java.lang.Boolean.TRUE;
    }
}
