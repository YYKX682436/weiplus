package x51;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx51/h;", "Lcom/tencent/mm/protobuf/f;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "plugin-comm.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public abstract class h<T extends com.tencent.mm.protobuf.f> {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f452012a = "MicroMsg.BaseProtoPage";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f452013b;

    public final void a() {
        java.lang.String str = this.f452013b;
        if (str == null) {
            kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            throw null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            synchronized (this) {
                java.lang.String str2 = this.f452013b;
                if (str2 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                }
                com.tencent.mm.vfs.w6.h(str2);
            }
            return;
        }
        java.lang.String str3 = this.f452012a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("file path [");
        java.lang.String str4 = this.f452013b;
        if (str4 == null) {
            kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            throw null;
        }
        sb6.append(str4);
        sb6.append("] is invalid!");
        com.tencent.mars.xlog.Log.e(str3, sb6.toString());
    }

    public final java.util.LinkedList b() {
        java.lang.String str = this.f452013b;
        if (str == null) {
            kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            throw null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e(this.f452012a, "file path [%s] is invalid!");
            return null;
        }
        synchronized (this) {
            java.lang.String str2 = this.f452013b;
            if (str2 == null) {
                kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                throw null;
            }
            if (!com.tencent.mm.vfs.w6.j(str2)) {
                java.lang.String str3 = this.f452012a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("file ");
                java.lang.String str4 = this.f452013b;
                if (str4 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                }
                sb6.append(str4);
                sb6.append(" is not exist!");
                com.tencent.mars.xlog.Log.i(str3, sb6.toString());
                return null;
            }
            try {
                java.lang.String str5 = this.f452013b;
                if (str5 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                }
                if (str5 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                }
                byte[] N = com.tencent.mm.vfs.w6.N(str5, 0, (int) com.tencent.mm.vfs.w6.k(str5));
                d36.a aVar = new d36.a();
                c36.a aVar2 = new c36.a(N, aVar);
                java.util.LinkedList<byte[]> j17 = aVar2.j(aVar2.a());
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (byte[] bArr : j17) {
                    java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
                    kotlin.jvm.internal.o.e(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                    java.lang.reflect.Type type = ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
                    kotlin.jvm.internal.o.e(type, "null cannot be cast to non-null type java.lang.Class<*>");
                    java.lang.Object newInstance = ((java.lang.Class) type).newInstance();
                    kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type T of com.tencent.mm.platformtools.BaseProtoPage.readFromFile$lambda$2$lambda$1");
                    com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) newInstance;
                    kotlin.jvm.internal.o.d(bArr);
                    c36.a aVar3 = new c36.a(bArr, aVar);
                    for (boolean z17 = true; z17; z17 = fVar.populateBuilderWithField(aVar3, fVar, com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3))) {
                    }
                    linkedList.add(fVar);
                }
                java.lang.String str6 = this.f452012a;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append("read ");
                sb7.append(linkedList.size());
                sb7.append(" items (total size ");
                sb7.append(N.length);
                sb7.append(") from file ");
                java.lang.String str7 = this.f452013b;
                if (str7 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                }
                sb7.append(str7);
                com.tencent.mars.xlog.Log.i(str6, sb7.toString());
                return linkedList;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(this.f452012a, "parse proto from file occur error: " + e17.getMessage());
                return null;
            }
        }
    }

    public final void c(java.util.LinkedList dataList) {
        int g17;
        java.lang.String str;
        java.lang.StringBuilder sb6;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        java.lang.String str3 = this.f452013b;
        if (str3 == null) {
            kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            throw null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e(this.f452012a, "file path [%s] is invalid!");
            return;
        }
        synchronized (this) {
            java.lang.String str4 = this.f452013b;
            if (str4 == null) {
                kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                throw null;
            }
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str4);
            if (!com.tencent.mm.vfs.w6.j(r6Var.r())) {
                com.tencent.mm.vfs.w6.u(r6Var.r());
            }
            java.lang.String str5 = this.f452013b;
            if (str5 == null) {
                kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                throw null;
            }
            if (!com.tencent.mm.vfs.w6.j(str5)) {
                java.lang.String str6 = this.f452012a;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("create new file ");
                java.lang.String str7 = this.f452013b;
                if (str7 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                }
                sb7.append(str7);
                com.tencent.mars.xlog.Log.i(str6, sb7.toString());
                java.lang.String str8 = this.f452013b;
                if (str8 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                }
                com.tencent.mm.vfs.w6.e(str8);
            }
            try {
                g17 = b36.f.g(1, 8, dataList);
                str = this.f452012a;
                sb6 = new java.lang.StringBuilder("write ");
                sb6.append(dataList.size());
                sb6.append(" items (total size ");
                sb6.append(g17);
                sb6.append(") to file ");
                str2 = this.f452013b;
            } catch (java.io.IOException e17) {
                java.lang.String str9 = this.f452012a;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("write to file ");
                java.lang.String str10 = this.f452013b;
                if (str10 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                }
                sb8.append(str10);
                sb8.append(" occur error: ");
                sb8.append(e17.getMessage());
                com.tencent.mars.xlog.Log.e(str9, sb8.toString());
            }
            if (str2 == null) {
                kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                throw null;
            }
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            byte[] bArr = new byte[g17];
            new g36.f(bArr).g(1, 8, dataList);
            java.lang.String str11 = this.f452013b;
            if (str11 == null) {
                kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                throw null;
            }
            com.tencent.mm.vfs.w6.S(str11, bArr, 0, g17);
        }
    }
}
