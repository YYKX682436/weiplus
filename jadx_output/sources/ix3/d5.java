package ix3;

/* loaded from: classes.dex */
public final class d5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.i5 f295389d;

    public d5(ix3.i5 i5Var) {
        this.f295389d = i5Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        ix3.i5 i5Var = this.f295389d;
        i5Var.getContext();
        ix3.m4[] m4VarArr = ix3.m4.f295497d;
        g4Var.j(0, "消息时间过期到 15天之前", com.tencent.mm.R.raw.icon_filled_add, i65.a.d(i5Var.getContext(), com.tencent.mm.R.color.f478502m), false);
        ix3.m4[] m4VarArr2 = ix3.m4.f295497d;
        g4Var.l(1, "删压缩视频", com.tencent.mm.R.raw.icons_filled_copy, false);
        ix3.m4[] m4VarArr3 = ix3.m4.f295497d;
        g4Var.l(2, "删原视频", com.tencent.mm.R.raw.icons_outlined_file_zip, false);
        ix3.m4[] m4VarArr4 = ix3.m4.f295497d;
        g4Var.l(3, "压缩视频过期", com.tencent.mm.R.raw.icons_filled_volume_up, false);
        ix3.m4[] m4VarArr5 = ix3.m4.f295497d;
        g4Var.l(4, "原视频过期", com.tencent.mm.R.raw.icons_filled_pay_ledger, false);
        ix3.m4[] m4VarArr6 = ix3.m4.f295497d;
        g4Var.l(5, "压缩视频下失败", com.tencent.mm.R.raw.icons_filled_qr_code, false);
        ix3.m4[] m4VarArr7 = ix3.m4.f295497d;
        g4Var.l(6, "原视频下失败", com.tencent.mm.R.raw.icons_filled_clip, false);
        ix3.m4[] m4VarArr8 = ix3.m4.f295497d;
        g4Var.l(7, "检查压缩需求", com.tencent.mm.R.raw.icons_outlined_file_zip, false);
    }
}
