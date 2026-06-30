package com.tencent.mm.plugin.priority.model.c2c.img;

/* loaded from: classes12.dex */
public class f extends lq3.c {
    public f(kq3.h hVar) {
        super(hVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgImgUsageStorage", "Create ImgUsageStorage");
    }

    @Override // lq3.c
    public java.lang.String d() {
        return "C2CMsgImgUsage";
    }

    @Override // lq3.c
    public long e() {
        return 1L;
    }

    @Override // lq3.c
    public long f() {
        return 17L;
    }
}
