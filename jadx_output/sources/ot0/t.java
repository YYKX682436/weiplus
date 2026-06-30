package ot0;

/* loaded from: classes12.dex */
public class t extends dm.o0 {
    public static final l75.e0 E = dm.o0.initAutoDBInfo(ot0.t.class);

    static {
        if (z65.c.a()) {
            boolean z17 = false;
            int i17 = 0;
            for (java.lang.reflect.Field field : ot0.q.class.getDeclaredFields()) {
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers()) && !field.getName().equals("_hellAccFlag_")) {
                    i17++;
                }
            }
            if (i17 > 215) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMessage", "AppMessage.Content should not add new field!!! (%d) is over the limit(%d)!!!", java.lang.Integer.valueOf(i17), 215);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMessage", "AppMessage.Content nonStaticFieldCount: %d", java.lang.Integer.valueOf(i17));
                z17 = true;
            }
            iz5.a.g(null, z17);
        }
    }

    @Override // dm.o0, l75.f0
    public l75.e0 getDBInfo() {
        return E;
    }
}
