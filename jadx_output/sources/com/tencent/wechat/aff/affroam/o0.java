package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public enum o0 implements com.tencent.mm.protobuf.h {
    AFFROAM_TASK_TYPE_UNKNOWN(0),
    AFFROAM_TASK_TYPE_AUTO_BACKUP(1),
    AFFROAM_TASK_TYPE_BACKUP(2),
    AFFROAM_TASK_TYPE_RESTORE(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f215937d;

    o0(int i17) {
        this.f215937d = i17;
    }

    public static com.tencent.wechat.aff.affroam.o0 a(int i17) {
        if (i17 == 0) {
            return AFFROAM_TASK_TYPE_UNKNOWN;
        }
        if (i17 == 1) {
            return AFFROAM_TASK_TYPE_AUTO_BACKUP;
        }
        if (i17 == 2) {
            return AFFROAM_TASK_TYPE_BACKUP;
        }
        if (i17 != 3) {
            return null;
        }
        return AFFROAM_TASK_TYPE_RESTORE;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f215937d;
    }
}
