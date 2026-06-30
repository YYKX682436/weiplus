package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public class m7 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f191776a;

    /* renamed from: b, reason: collision with root package name */
    public int f191777b;

    public m7(android.content.Context context, android.net.Uri uri) {
        java.lang.String string;
        this.f191777b = 0;
        if (uri == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "initFileTypeAndPath uri == null");
            return;
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "initFileTypeAndPath context == null");
            return;
        }
        android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
        java.lang.String type = context.getContentResolver().getType(uri);
        if (type != null && type.length() > 0) {
            android.database.Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor is null");
            } else if (query.getCount() <= 0 || !query.moveToFirst()) {
                query.close();
                com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
            } else {
                int columnIndex = query.getColumnIndex("_data");
                if (columnIndex == -1) {
                    query.close();
                    com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "getFilePath : columnIdx is -1, column with columnName = _data does not exist");
                } else {
                    string = query.getString(columnIndex);
                    query.close();
                    this.f191776a = string;
                }
            }
            string = null;
            this.f191776a = string;
        } else if (uri.getPath() != null) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(uri.getPath());
            if (!r6Var.m()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "File is null");
                this.f191777b = 0;
                return;
            }
            java.lang.String o17 = r6Var.o();
            this.f191776a = o17;
            int lastIndexOf = o17.lastIndexOf(".");
            if (lastIndexOf == -1 || lastIndexOf >= this.f191776a.length() - 1) {
                this.f191777b = 1;
            } else {
                type = singleton.getMimeTypeFromExtension(this.f191776a.substring(lastIndexOf + 1));
            }
        }
        if (type == null || this.f191776a == null) {
            this.f191777b = 0;
            return;
        }
        if (type.contains("image")) {
            this.f191777b = 3;
        } else if (type.contains("video")) {
            this.f191777b = 4;
        } else if (type.contains("audio")) {
            this.f191777b = 5;
        } else if (type.contains("mm_item")) {
            this.f191777b = 2;
        } else {
            this.f191777b = 1;
        }
        uri.toString();
    }
}
