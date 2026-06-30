package ro1;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final ro1.v f398014a = new ro1.v();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f398015b = jz5.h.b(ro1.u.f398013d);

    public final java.util.List a() {
        java.util.Collection values = c().values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.List V0 = kz5.n0.V0(values);
        oo1.j jVar = oo1.j.f347145a;
        return V0;
    }

    public final java.util.List b() {
        java.io.File file;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.Object systemService = context.getSystemService("storage");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
        java.util.List<android.os.storage.StorageVolume> storageVolumes = ((android.os.storage.StorageManager) systemService).getStorageVolumes();
        kotlin.jvm.internal.o.f(storageVolumes, "getStorageVolumes(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.os.storage.StorageVolume storageVolume : storageVolumes) {
            po1.d dVar = null;
            if (kotlin.jvm.internal.o.b(storageVolume.getState(), "mounted")) {
                ro1.a aVar = ro1.a.f397974a;
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    file = storageVolume.getDirectory();
                } else {
                    java.lang.reflect.Field field = ro1.a.f397975b;
                    java.lang.Object obj = field != null ? field.get(storageVolume) : null;
                    file = obj instanceof java.io.File ? (java.io.File) obj : null;
                }
                java.lang.String absolutePath = file != null ? file.getAbsolutePath() : null;
                if (absolutePath == null) {
                    absolutePath = "";
                }
                java.lang.String str2 = absolutePath;
                storageVolume.isPrimary();
                if (!storageVolume.isPrimary() && storageVolume.isRemovable()) {
                    java.lang.String uuid = storageVolume.getUuid();
                    if (!(uuid == null || uuid.length() == 0)) {
                        po1.g gVar = po1.g.f357310h;
                        java.lang.String description = storageVolume.getDescription(context);
                        kotlin.jvm.internal.o.f(description, "getDescription(...)");
                        java.lang.String uuid2 = storageVolume.getUuid();
                        kotlin.jvm.internal.o.d(uuid2);
                        dVar = new po1.d("usb-default-device-id", gVar, description, "", str2, uuid2, "");
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.UsbVolumeHelper", "Skip volume that state is " + storageVolume.getState() + ", uuid=" + storageVolume.getUuid() + ", " + storageVolume.getDescription(context));
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        oo1.j jVar = oo1.j.f347145a;
        com.tencent.mars.xlog.Log.i("MicroMsg.UsbVolumeHelper", "getAllStorageVolumeFromSystem, result.size=" + arrayList.size());
        return arrayList;
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) f398015b).getValue();
    }

    public final java.lang.String d(java.lang.String path, ro1.i fileOps) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(fileOps, "fileOps");
        jz5.l j17 = j(path, fileOps);
        return j17 != null ? (java.lang.String) j17.f302833d : r26.i0.n(path, "/", false) ? path.concat("ChatBackup") : path.concat("/ChatBackup");
    }

    public final po1.d e(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        oo1.j jVar = oo1.j.f347145a;
        return (po1.d) c().get(deviceId);
    }

    public final boolean f(po1.d device) {
        kotlin.jvm.internal.o.g(device, "device");
        return kotlin.jvm.internal.o.b(device.f357295a, "usb-default-device-id");
    }

    public final void g(po1.d deviceInfo) {
        kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
        if (c().putIfAbsent(deviceInfo.f357295a, deviceInfo) == null) {
            oo1.o.f347151a.b().D(deviceInfo.f357295a, deviceInfo.c());
        }
    }

    public final boolean h(po1.d device, ro1.i fileOps) {
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(fileOps, "fileOps");
        oo1.j jVar = oo1.j.f347145a;
        f(device);
        ro1.b bVar = ro1.c.f397976c;
        ro1.c c17 = bVar.c(device.f357299e, fileOps);
        if (c17 != null) {
            java.lang.String str = c17.f397977a;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            device.f357295a = str;
            com.tencent.mars.xlog.Log.w("MicroMsg.UsbVolumeHelper", "Select a exist directory, device=" + device);
            return i(device);
        }
        java.lang.String str2 = device.f357295a;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        device.f357295a = uuid;
        boolean d17 = bVar.d(device, fileOps);
        if (!d17) {
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            device.f357295a = str2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UsbVolumeHelper", "write device=" + device + " to meta file, isSuccess=" + d17);
        return d17 && i(device);
    }

    public final boolean i(po1.d dVar) {
        if (!oo1.o.f347151a.b().D(dVar.f357295a, dVar.c())) {
            return false;
        }
        c().put(dVar.f357295a, dVar);
        return true;
    }

    public final jz5.l j(java.lang.String str, ro1.i iVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UsbVolumeHelper", "try read deviceId from meta file, path=" + str);
        java.lang.String b17 = ro1.a.f397974a.b(str, "ChatBackup");
        ro1.b bVar = ro1.c.f397976c;
        ro1.c c17 = bVar.c(b17, iVar);
        if (c17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UsbVolumeHelper", "deviceId from meta file is " + c17 + ", baseDirWithDefaultDir=" + b17);
            return new jz5.l(b17, c17);
        }
        ro1.c c18 = bVar.c(str, iVar);
        if (c18 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UsbVolumeHelper", "deviceId from meta file is " + c18 + ", backupBaseDirectory=" + str);
            return new jz5.l(str, c18);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.UsbVolumeHelper", "Fail to read deviceId from " + b17 + " and " + str);
        return null;
    }

    public final boolean k(po1.d device, ro1.i fileOps) {
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(fileOps, "fileOps");
        po1.d e17 = e(device.f357295a);
        com.tencent.mars.xlog.Log.w("MicroMsg.UsbVolumeHelper", "Device from mmkv is " + e17);
        boolean z17 = false;
        if (e17 == null || !kotlin.jvm.internal.o.b(e17.f357300f, device.f357300f) || !r26.i0.A(e17.f357299e, device.f357299e, false, 2, null)) {
            return false;
        }
        java.lang.String str = device.f357299e;
        device.d(e17.f357299e);
        if (ro1.c.f397976c.d(device, fileOps) && i(device)) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UsbVolumeHelper", "Fail to regenerate meta file, device=" + device);
            device.d(str);
        }
        return z17;
    }
}
