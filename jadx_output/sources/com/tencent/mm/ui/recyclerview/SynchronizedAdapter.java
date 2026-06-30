package com.tencent.mm.ui.recyclerview;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/recyclerview/SynchronizedAdapter;", "Landroidx/recyclerview/widget/k3;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/f2;", "Landroid/view/View;", "itemView", "", "isAsyncView", "holder", "", "position", "", "", "payloads", "Ljz5/f0;", "onBindViewHolder", "(Landroidx/recyclerview/widget/k3;ILjava/util/List;)V", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "isEnableSynchronized", "Z", "()Z", "setEnableSynchronized", "(Z)V", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class SynchronizedAdapter<T extends androidx.recyclerview.widget.k3> extends androidx.recyclerview.widget.f2 {
    private boolean isEnableSynchronized;
    private final java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();

    private final boolean isAsyncView(android.view.View itemView) {
        return kotlin.jvm.internal.o.b(itemView.getTag(com.tencent.mm.R.id.f482350c5), 1);
    }

    /* renamed from: isEnableSynchronized, reason: from getter */
    public final boolean getIsEnableSynchronized() {
        return this.isEnableSynchronized;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(T holder, int position, java.util.List<java.lang.Object> payloads) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (!this.isEnableSynchronized) {
            super.onBindViewHolder(holder, position, payloads);
            return;
        }
        try {
            long nanoTime = java.lang.System.nanoTime();
            this.lock.lock();
            long nanoTime2 = java.lang.System.nanoTime() - nanoTime;
            if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    super.onBindViewHolder(holder, position, payloads);
                    m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                java.util.HashMap hashMap = oj5.r.f345877h;
                java.lang.String str = (java.lang.String) oj5.r.f345877h.get(java.lang.Integer.valueOf(hashCode()));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBindViewHolder] waitLock=");
                sb6.append(nanoTime2);
                sb6.append("ns position=");
                sb6.append(position);
                sb6.append(" isAsyncView=");
                android.view.View itemView = holder.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                sb6.append(isAsyncView(itemView));
                sb6.append(" throwable=");
                sb6.append(m524exceptionOrNullimpl != null ? m524exceptionOrNullimpl.getMessage() : null);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                if (m524exceptionOrNullimpl != null) {
                    throw m524exceptionOrNullimpl;
                }
            } else {
                super.onBindViewHolder(holder, position, payloads);
            }
        } finally {
            if (this.lock.isHeldByCurrentThread()) {
                this.lock.unlock();
            }
        }
    }

    public final void setEnableSynchronized(boolean z17) {
        this.isEnableSynchronized = z17;
    }
}
