package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xx f128330d = new com.tencent.mm.plugin.finder.storage.xx();

    public xx() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lb2.j jVar = new lb2.j("", "视频号目录清理配置(重启)");
        jVar.a("FINDER_VFS_STORAGE_CONFIG", kz5.c0.i("", "{\"targetSize\":52428800,\"expireTimes\":300000,\"thresholds\":52428800,\"isCache\":true,\"interval\":0}"), kz5.c0.i("VFSStorageConfig代码配置", "清理到50M，5分钟过期"));
        lb2.j.d(jVar, e42.d0.clicfg_finder_vfs_storage_config, false, 2, null);
        return jVar;
    }
}
