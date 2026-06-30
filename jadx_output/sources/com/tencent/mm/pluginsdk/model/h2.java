package com.tencent.mm.pluginsdk.model;

/* loaded from: classes13.dex */
public class h2 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f189332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f189333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ec0.e f189334c;

    public h2(android.content.Context context, java.lang.String[] strArr, ec0.e eVar) {
        this.f189332a = context;
        this.f189333b = strArr;
        this.f189334c = eVar;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        return this.f189332a.getContentResolver().query(android.net.Uri.parse(com.tencent.mm.pluginsdk.model.i2.f189342a), null, null, this.f189333b, null);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        android.database.Cursor cursor = (android.database.Cursor) obj;
        ec0.e eVar = this.f189334c;
        if (cursor == null || cursor.getCount() <= 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : this.f189333b) {
                arrayList.add(new com.tencent.mm.pluginsdk.model.q3(-1, str, "", "", "", 10237));
            }
            eVar.i3(arrayList);
        } else {
            cursor.moveToFirst();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                arrayList2.add(new com.tencent.mm.pluginsdk.model.q3(cursor.getInt(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("product_id")), cursor.getString(cursor.getColumnIndex("full_price")), cursor.getString(cursor.getColumnIndex("price_currency")), cursor.getString(cursor.getColumnIndex("price_amount")), cursor.getInt(cursor.getColumnIndex("product_state"))));
                cursor.moveToNext();
            }
            cursor.close();
            eVar.i3(arrayList2);
        }
        super.onPostExecute(cursor);
    }
}
