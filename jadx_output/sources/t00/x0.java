package t00;

/* loaded from: classes9.dex */
public class x0 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414320a;
    }

    @Override // t00.r0
    public boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    @Override // t00.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r19, android.content.Context r20, org.json.JSONObject r21, c00.n3 r22, org.json.JSONObject r23) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t00.x0.c(int, android.content.Context, org.json.JSONObject, c00.n3, org.json.JSONObject):void");
    }

    @Override // t00.r0
    public boolean g() {
        return !(this instanceof t00.y0);
    }

    public final org.json.JSONObject h(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.Object opt = jSONObject.opt(str);
        if (opt instanceof org.json.JSONObject) {
            return (org.json.JSONObject) opt;
        }
        if (opt instanceof java.lang.String) {
            if (((java.lang.CharSequence) opt).length() == 0) {
                return null;
            }
            try {
                return new org.json.JSONObject((java.lang.String) opt);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenEcsEcsActionHandler", "optJsonObject parse failed, key: " + str + ", err: " + e17);
            }
        }
        return null;
    }
}
