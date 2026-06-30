package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public enum n0 implements com.tencent.mm.protobuf.h {
    AFFROAM_TASK_STATE_INITED(0),
    AFFROAM_TASK_STATE_PREPARING(1),
    AFFROAM_TASK_STATE_RUNNING(2),
    AFFROAM_TASK_STATE_PAUSED(3),
    AFFROAM_TASK_STATE_COMPLETED(4),
    AFFROAM_TASK_STATE_STOPPED(5),
    AFFROAM_TASK_STATE_QUIT(6),
    AFFROAM_TASK_STATE_ERROR(7),
    AFFROAM_TASK_STATE_IMPORTING(8),
    AFFROAM_TASK_STATE_DELETING(9),
    AFFROAM_TASK_STATE_CONNECTING(10);


    /* renamed from: d, reason: collision with root package name */
    public final int f215928d;

    n0(int i17) {
        this.f215928d = i17;
    }

    public static com.tencent.wechat.aff.affroam.n0 a(int i17) {
        switch (i17) {
            case 0:
                return AFFROAM_TASK_STATE_INITED;
            case 1:
                return AFFROAM_TASK_STATE_PREPARING;
            case 2:
                return AFFROAM_TASK_STATE_RUNNING;
            case 3:
                return AFFROAM_TASK_STATE_PAUSED;
            case 4:
                return AFFROAM_TASK_STATE_COMPLETED;
            case 5:
                return AFFROAM_TASK_STATE_STOPPED;
            case 6:
                return AFFROAM_TASK_STATE_QUIT;
            case 7:
                return AFFROAM_TASK_STATE_ERROR;
            case 8:
                return AFFROAM_TASK_STATE_IMPORTING;
            case 9:
                return AFFROAM_TASK_STATE_DELETING;
            case 10:
                return AFFROAM_TASK_STATE_CONNECTING;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f215928d;
    }
}
