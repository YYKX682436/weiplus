package com.tencent.mm.repairer.config.textstatus;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/textstatus/RepairerConfigTextStatusComment;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class RepairerConfigTextStatusComment extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_TextStatusComment";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "状态评论开关（1.评论按钮入口 2.收评论通知）";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupTextStatus.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 1;
    }

    @Override // q55.e
    public java.lang.String j() {
        return "StatusAllowComment";
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_text_status_show_comment_and";
    }
}
