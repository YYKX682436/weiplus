package mn2;

/* loaded from: classes2.dex */
public final class j3 extends mn2.c1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(r45.mb4 mediaObj, com.tencent.mm.plugin.finder.storage.y90 type) {
        super(mediaObj, type, null, null, 12, null);
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        kotlin.jvm.internal.o.g(type, "type");
    }

    @Override // mn2.c1, ip0.c
    public java.lang.String n() {
        java.lang.String string;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_image_");
        sb6.append(this.f329924f.f128374d);
        sb6.append('_');
        r45.mb4 mb4Var = this.f329923e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(9))) {
            java.lang.String string2 = mb4Var.getString(0);
            if (string2 == null) {
                string2 = "";
            }
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            string = com.tencent.mm.sdk.platformtools.w2.b(string2.getBytes());
        } else {
            string = mb4Var.getString(9);
        }
        sb6.append(string);
        return sb6.toString();
    }
}
