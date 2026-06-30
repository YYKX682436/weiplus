package mn2;

/* loaded from: classes2.dex */
public class c1 extends mn2.a implements ip0.d {

    /* renamed from: e, reason: collision with root package name */
    public final r45.mb4 f329923e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.y90 f329924f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f329925g;

    public c1(r45.mb4 mediaObj, com.tencent.mm.plugin.finder.storage.y90 type, java.lang.String username, java.lang.String localThumbUrl, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 4) != 0) {
            username = c01.z1.r();
            kotlin.jvm.internal.o.f(username, "getUsernameFromUserInfo(...)");
        }
        localThumbUrl = (i17 & 8) != 0 ? "" : localThumbUrl;
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(localThumbUrl, "localThumbUrl");
        kotlin.jvm.internal.o.f(c01.z1.r(), "getUsernameFromUserInfo(...)");
        this.f329923e = mediaObj;
        this.f329924f = type;
        this.f329925g = localThumbUrl;
        if (mediaObj.getString(0) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaObj.url == null ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            java.lang.String sb7 = sb6.toString();
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("FinderImage", sb7, null);
        }
    }

    @Override // ip0.d
    public android.graphics.Matrix a(float f17, float f18) {
        if (this.f329924f == com.tencent.mm.plugin.finder.storage.y90.f128356f) {
            return null;
        }
        r45.mb4 mb4Var = this.f329923e;
        r45.bb1 bb1Var = (r45.bb1) mb4Var.getCustom(34);
        if (bb1Var == null) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.Rect rect = new android.graphics.Rect((int) bb1Var.getFloat(0), (int) bb1Var.getFloat(1), (int) bb1Var.getFloat(2), (int) bb1Var.getFloat(3));
        float max = java.lang.Math.max(f17 / rect.width(), f18 / rect.height());
        mb4Var.getFloat(4);
        mb4Var.getFloat(5);
        int i17 = -rect.left;
        int i18 = -rect.top;
        matrix.postScale(max, max);
        matrix.postTranslate(i17 * max, i18 * max);
        return matrix;
    }

    @Override // mn2.h3
    public com.tencent.mm.plugin.finder.storage.y90 getMediaType() {
        return this.f329924f;
    }

    @Override // mn2.h3
    public java.lang.String getPath() {
        java.lang.String str = this.f329925g;
        if (!(str.length() == 0)) {
            return str;
        }
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        return com.tencent.mm.plugin.finder.assist.e9.f102139h + n();
    }

    @Override // mn2.h3
    public java.lang.String getUrl() {
        java.lang.String string = this.f329923e.getString(0);
        return string == null ? "" : string;
    }

    @Override // mn2.h3
    public java.lang.String h() {
        java.lang.String string = this.f329923e.getString(17);
        return string == null ? "" : string;
    }

    @Override // mn2.h3
    public java.lang.String i() {
        java.lang.String string = this.f329923e.getString(18);
        return string == null ? "" : string;
    }

    @Override // mn2.h3
    public java.lang.String l() {
        java.lang.String str = this.f329925g;
        if ((str.length() == 0) && (str = this.f329923e.getString(1)) == null) {
            str = "";
        }
        kotlin.jvm.internal.o.d(str);
        return str;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        java.lang.String string;
        return (!(this.f329925g.length() == 0) || (string = this.f329923e.getString(19)) == null) ? "" : string;
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.String string;
        java.lang.String string2;
        com.tencent.mm.plugin.finder.storage.y90 y90Var = com.tencent.mm.plugin.finder.storage.y90.f128356f;
        r45.mb4 mb4Var = this.f329923e;
        com.tencent.mm.plugin.finder.storage.y90 y90Var2 = this.f329924f;
        if (y90Var2 != y90Var ? (string = mb4Var.getString(47)) == null : (string = mb4Var.getString(46)) == null) {
            string = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_image_");
        sb6.append(y90Var2.f128374d);
        sb6.append('_');
        if (com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(9))) {
            java.lang.String string3 = mb4Var.getString(0);
            java.lang.String str = string3 != null ? string3 : "";
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            string2 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        } else {
            string2 = mb4Var.getString(9);
        }
        sb6.append(string2);
        sb6.append('_');
        sb6.append(string);
        return sb6.toString();
    }
}
