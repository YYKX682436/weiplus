package ry2;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f401371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ry2.q0 q0Var) {
        super(0);
        this.f401371d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap;
        java.util.LinkedList linkedList;
        r45.ho6 ho6Var;
        java.lang.String str;
        r45.i70 i70Var;
        r45.i70 i70Var2;
        r45.i70 i70Var3;
        r45.h70 h70Var;
        java.util.LinkedList<r45.ho6> linkedList2;
        ry2.q0 q0Var = this.f401371d;
        r45.h70 h70Var2 = q0Var.B;
        if (h70Var2 != null && (linkedList2 = h70Var2.f375897d) != null) {
            for (r45.ho6 ho6Var2 : linkedList2) {
                if (ho6Var2 != null) {
                    java.lang.String path = ho6Var2.f376333d;
                    kotlin.jvm.internal.o.f(path, "path");
                    ry2.q0.o(q0Var, path);
                }
            }
        }
        pm0.v.X(new ry2.a0(q0Var));
        if (android.text.TextUtils.isEmpty(q0Var.D) && (h70Var = q0Var.B) != null) {
            try {
                r45.fp5 b17 = q0Var.P.b(h70Var);
                if (!android.text.TextUtils.isEmpty(b17.f374528d)) {
                    java.lang.String coverUrl = b17.f374528d;
                    kotlin.jvm.internal.o.f(coverUrl, "coverUrl");
                    q0Var.D = coverUrl;
                    java.lang.String fullCoverUrl = b17.f374529e;
                    kotlin.jvm.internal.o.f(fullCoverUrl, "fullCoverUrl");
                    q0Var.E = fullCoverUrl;
                    q0Var.G = b17.f374530f;
                    java.lang.String shareCoverUrl = b17.f374536o;
                    kotlin.jvm.internal.o.f(shareCoverUrl, "shareCoverUrl");
                    q0Var.F = shareCoverUrl;
                    q0Var.L = b17;
                    pm0.v.X(new ry2.b0(q0Var));
                    com.tencent.mars.xlog.Log.w("Finder.PostVideoWidget", "initFakeVideoLogic replace cover quality:" + q0Var.G + " path:" + q0Var.D);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w("Finder.PostVideoWidget", "initFakeVideoLogic replace cover e:" + th6);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "initFakeVideoLogic: thumbUrl:" + q0Var.C + " coverUrl:" + q0Var.D);
        android.graphics.Bitmap bitmap2 = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(q0Var.D)) {
            bitmap = null;
        } else {
            bitmap = com.tencent.mm.graphics.e.c(q0Var.D);
            q0Var.C = q0Var.D;
        }
        if (bitmap == null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(q0Var.C)) {
                r45.h70 h70Var3 = q0Var.B;
                if (h70Var3 != null && (linkedList = h70Var3.f375897d) != null && (ho6Var = (r45.ho6) kz5.n0.a0(linkedList, 0)) != null && (str = ho6Var.f376333d) != null) {
                    com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "initFakeVideoLogic: get thumb from composition info");
                    java.lang.String i17 = mv2.q.f331618a.i(str);
                    q0Var.C = i17;
                    bitmap = com.tencent.mm.graphics.e.c(i17);
                }
            } else {
                com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "initFakeVideoLogic: get thumb from thumbUrl");
                bitmap = com.tencent.mm.graphics.e.c(q0Var.C);
            }
            if (!q0Var.x()) {
                try {
                    r45.h70 h70Var4 = q0Var.B;
                    if (((h70Var4 == null || (i70Var3 = h70Var4.f375902i) == null) ? null : i70Var3.f376794z) != null) {
                        bitmap2 = bitmap;
                    } else {
                        java.lang.Float valueOf = (h70Var4 == null || (i70Var2 = h70Var4.f375902i) == null) ? null : java.lang.Float.valueOf(i70Var2.f376780i);
                        r45.h70 h70Var5 = q0Var.B;
                        java.lang.Float valueOf2 = (h70Var5 == null || (i70Var = h70Var5.f375902i) == null) ? null : java.lang.Float.valueOf(i70Var.f376776e);
                        float floatValue = (valueOf == null || valueOf2 == null) ? 1.0f : valueOf.floatValue() / valueOf2.floatValue();
                        if (q0Var.f401447J != null) {
                            bitmap2 = com.tencent.mm.sdk.platformtools.x.E(bitmap, (int) (r6.left * floatValue), (int) (r6.top * floatValue), (int) (r6.width() * floatValue), (int) (r6.height() * floatValue), false);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("Finder.PostVideoWidget", "generate halfThumb fail:" + e17.getLocalizedMessage());
                }
                if (bitmap2 != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                    java.lang.String Ai = t21.o2.Bi().Ai();
                    kotlin.jvm.internal.o.f(Ai, "getAccVideoPath(...)");
                    sb6.append(Ai);
                    sb6.append("vsg_half_thumb_");
                    sb6.append(java.lang.System.currentTimeMillis());
                    java.lang.String sb7 = sb6.toString();
                    q0Var.I = sb7;
                    com.tencent.mm.sdk.platformtools.x.D0(bitmap2, 60, android.graphics.Bitmap.CompressFormat.JPEG, sb7, false);
                    bitmap = bitmap2;
                }
                com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "initFakeVideoLogic: make half thumb, halfThumbUrl:" + q0Var.I);
            }
        }
        q0Var.z(bitmap);
        return jz5.f0.f302826a;
    }
}
