package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public abstract class t7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f208080a = new java.util.LinkedHashMap();

    public abstract com.tencent.mm.ui.conversation.w7 a(android.database.Cursor cursor, int i17);

    public com.tencent.mm.ui.conversation.w7 b(int i17) {
        android.database.Cursor d17 = d();
        if (d17 == null) {
            return new com.tencent.mm.ui.conversation.w7(i17, 0);
        }
        com.tencent.mm.ui.conversation.w7 w7Var = com.tencent.mm.ui.conversation.w7.f208220f;
        if (i17 < 0) {
            return w7Var;
        }
        try {
            d17.moveToPosition(i17);
            return a(d17, i17);
        } catch (java.lang.Throwable unused) {
            return w7Var;
        }
    }

    public final int c(android.database.Cursor cursor, java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap = this.f208080a;
        java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        java.lang.String[] columnNames = cursor.getColumnNames();
        for (int i17 = 0; i17 < columnNames.length; i17++) {
            if (str.equals(columnNames[i17])) {
                linkedHashMap.put(str, java.lang.Integer.valueOf(i17));
                return i17;
            }
        }
        linkedHashMap.put(str, -1);
        return -1;
    }

    public abstract android.database.Cursor d();
}
