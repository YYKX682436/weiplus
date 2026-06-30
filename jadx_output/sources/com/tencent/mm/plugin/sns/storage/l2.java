package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    public int f166044a;

    /* renamed from: b, reason: collision with root package name */
    public long f166045b;

    /* renamed from: c, reason: collision with root package name */
    public int f166046c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f166047d;

    /* renamed from: e, reason: collision with root package name */
    public long f166048e;

    /* renamed from: f, reason: collision with root package name */
    public int f166049f;

    /* renamed from: g, reason: collision with root package name */
    public int f166050g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f166051h;

    /* renamed from: i, reason: collision with root package name */
    public int f166052i;

    /* renamed from: j, reason: collision with root package name */
    public int f166053j;

    /* renamed from: k, reason: collision with root package name */
    public long f166054k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f166055l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f166056m;

    public void a(android.database.Cursor cursor) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i17 = cursor.getInt(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalid", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166044a = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalid", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        long j17 = cursor.getLong(1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setServerId", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166045b = j17;
        k(ca4.z0.t0(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setServerId", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i18 = cursor.getInt(2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166046c = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        long j18 = cursor.getLong(3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166048e = j18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        java.lang.String string = cursor.getString(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166047d = string;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i19 = cursor.getInt(5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166050g = i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        j(cursor.getInt(6));
        int i27 = cursor.getInt(7);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166052i = i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        l(cursor.getString(8));
        int i28 = cursor.getInt(9);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTryNnums", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166053j = i28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTryNnums", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        long j19 = cursor.getLong(10);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTryTimes", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166054k = j19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTryTimes", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        k(cursor.getString(11));
        m(cursor.getBlob(12));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }

    public android.content.ContentValues b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertToMedia", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("seqId", java.lang.Long.valueOf(this.f166045b));
        contentValues.put("type", java.lang.Integer.valueOf(this.f166046c));
        contentValues.put("createTime", java.lang.Long.valueOf(this.f166048e));
        contentValues.put("userName", this.f166047d);
        contentValues.put("totallen", java.lang.Integer.valueOf(this.f166050g));
        contentValues.put("offset", java.lang.Integer.valueOf(this.f166049f));
        contentValues.put("local_flag", java.lang.Integer.valueOf(this.f166052i));
        contentValues.put("tmp_path", this.f166051h);
        contentValues.put("nums", java.lang.Integer.valueOf(this.f166053j));
        contentValues.put("try_times", java.lang.Long.valueOf(this.f166054k));
        contentValues.put("StrId", this.f166055l);
        contentValues.put("upload_buf", this.f166056m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertToMedia", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return contentValues;
    }

    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i17 = this.f166044a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return i17;
    }

    public int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOffset", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i17 = this.f166049f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOffset", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return i17;
    }

    public java.lang.String e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTmpPath", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        java.lang.String str = this.f166051h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTmpPath", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return str;
    }

    public int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i17 = this.f166050g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return i17;
    }

    public int g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i17 = this.f166046c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return i17;
    }

    public byte[] h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUploadBuf", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        byte[] bArr = this.f166056m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUploadBuf", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return bArr;
    }

    public boolean i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUploadCompleted", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        boolean z17 = d() == f() && f() != 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUploadCompleted", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return z17;
    }

    public void j(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOffset", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166049f = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOffset", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }

    public void k(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStrId", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166055l = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStrId", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }

    public void l(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTmpPath", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166051h = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTmpPath", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }

    public void m(byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUploadBuf", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166056m = bArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUploadBuf", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }

    public void n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unSetUpload", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i17 = this.f166052i & (-5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f166052i = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unSetUpload", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }
}
