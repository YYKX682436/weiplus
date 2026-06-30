package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public class ja {

    /* renamed from: a, reason: collision with root package name */
    public int f195057a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f195058b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.storage.ia f195059c;

    /* renamed from: d, reason: collision with root package name */
    public int f195060d;

    /* renamed from: e, reason: collision with root package name */
    public int f195061e;

    public ja() {
        this.f195057a = 135;
        this.f195059c = null;
        this.f195058b = "";
        this.f195060d = 0;
        this.f195061e = 0;
    }

    public void a(android.database.Cursor cursor) {
        if ((this.f195057a & 2) != 0) {
            java.lang.String string = cursor.getString(1);
            this.f195058b = string;
            if (this.f195059c == null) {
                this.f195059c = new com.tencent.mm.storage.ia(string);
            }
        }
        if ((this.f195057a & 4) != 0) {
            this.f195060d = cursor.getInt(2);
        }
        if ((this.f195057a & 128) != 0) {
            this.f195061e = cursor.getInt(7);
        }
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f195057a & 2) != 0) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f195058b);
        }
        if ((this.f195057a & 4) != 0) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f195060d));
        }
        if ((this.f195057a & 128) != 0) {
            contentValues.put("int_reserved1", java.lang.Integer.valueOf(this.f195061e));
        }
        return contentValues;
    }

    public boolean c() {
        return (this.f195060d & 1) != 0;
    }

    public ja(java.lang.String str, boolean z17, boolean z18, int i17) {
        this.f195057a = 135;
        this.f195058b = "";
        this.f195059c = null;
        this.f195059c = new com.tencent.mm.storage.ia(str);
        this.f195058b = str;
        this.f195060d = (z18 ? 2 : 0) | (z17 ? 1 : 0);
        this.f195061e = i17;
    }
}
