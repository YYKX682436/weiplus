package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006#$\u0003\r%&B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013¨\u0006'"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupBaseItemMvvmView;", "Lb11/d;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/g0;", "getAttachState", "Landroid/graphics/Bitmap;", "getBitmap", "Lpk4/d;", "w", "Ljz5/g;", "getVideoView", "()Lpk4/d;", "videoView", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/h0;", "getPrepareContext", "()Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/h0;", "prepareContext", "", "getForbidTryPrepareLocal", "()Z", "forbidTryPrepareLocal", "getForbidTryPrepareOnline", "forbidTryPrepareOnline", "getForbidTryPrepareDownload", "forbidTryPrepareDownload", "getShowDebugInfo", "showDebugInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/f0", "Event", "State", "com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/i0", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ChattingMediaGroupVideoItemMvvmView extends com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView<b11.d> {
    public static final /* synthetic */ int B = 0;
    public final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.i0 A;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f204726m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State f204727n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f204728o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event f204729p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f204730q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f204731r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.r2 f204732s;

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.f1 f204733t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Long f204734u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 f204735v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final jz5.g videoView;

    /* renamed from: x, reason: collision with root package name */
    public wf0.u1 f204737x;

    /* renamed from: y, reason: collision with root package name */
    public em.t f204738y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.d1 f204739z;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event;", "", "GlobalEvent", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent;", "app_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes6.dex */
    public interface Event {

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0004\u0005\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event;", "AttachedToWindow", "DetachedFromWindow", "NewViewModel", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent$AttachedToWindow;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent$DetachedFromWindow;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent$NewViewModel;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$UserEvent$SwipeEnd;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public interface GlobalEvent extends com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event {

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent$AttachedToWindow;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes6.dex */
            public static final /* data */ class AttachedToWindow implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent {

                /* renamed from: a, reason: collision with root package name */
                public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent.AttachedToWindow f204740a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent.AttachedToWindow();

                private AttachedToWindow() {
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent.AttachedToWindow)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 205669625;
                }

                public java.lang.String toString() {
                    return "AttachedToWindow";
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent$DetachedFromWindow;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes6.dex */
            public static final /* data */ class DetachedFromWindow implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent {

                /* renamed from: a, reason: collision with root package name */
                public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent.DetachedFromWindow f204741a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent.DetachedFromWindow();

                private DetachedFromWindow() {
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent.DetachedFromWindow)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 1661673398;
                }

                public java.lang.String toString() {
                    return "DetachedFromWindow";
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent$NewViewModel;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent;", "app_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes8.dex */
            public static final /* data */ class NewViewModel implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent {

                /* renamed from: a, reason: collision with root package name */
                public final b11.d f204742a;

                public NewViewModel(b11.d viewModel) {
                    kotlin.jvm.internal.o.g(viewModel, "viewModel");
                    this.f204742a = viewModel;
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent.NewViewModel) && kotlin.jvm.internal.o.b(this.f204742a, ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent.NewViewModel) obj).f204742a);
                }

                public int hashCode() {
                    return this.f204742a.hashCode();
                }

                public java.lang.String toString() {
                    return "NewViewModel(viewModel=" + this.f204742a + ')';
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State;", "", "Failed", "Idle", "Prepared", "Preparing", "Stopped", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Idle;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Prepared;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Stopped;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public interface State {

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State;", "DownloadingFailed", "PlayingFailed", "PreparingVideoViewFailed", "UploadingFailed", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed$DownloadingFailed;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed$PlayingFailed;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed$PreparingVideoViewFailed;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed$UploadingFailed;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public interface Failed extends com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State {

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed$DownloadingFailed;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes5.dex */
            public static final /* data */ class DownloadingFailed implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed {

                /* renamed from: a, reason: collision with root package name */
                public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.DownloadingFailed f204754a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.DownloadingFailed();

                private DownloadingFailed() {
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.DownloadingFailed)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 1986454402;
                }

                public java.lang.String toString() {
                    return "DownloadingFailed";
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed$PlayingFailed;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes5.dex */
            public static final /* data */ class PlayingFailed implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed {

                /* renamed from: a, reason: collision with root package name */
                public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.PlayingFailed f204755a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.PlayingFailed();

                private PlayingFailed() {
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.PlayingFailed)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 379535318;
                }

                public java.lang.String toString() {
                    return "PlayingFailed";
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed$PreparingVideoViewFailed;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes5.dex */
            public static final /* data */ class PreparingVideoViewFailed implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed {

                /* renamed from: a, reason: collision with root package name */
                public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.PreparingVideoViewFailed f204756a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.PreparingVideoViewFailed();

                private PreparingVideoViewFailed() {
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.PreparingVideoViewFailed)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 450044622;
                }

                public java.lang.String toString() {
                    return "PreparingVideoViewFailed";
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed$UploadingFailed;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Failed;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes5.dex */
            public static final /* data */ class UploadingFailed implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed {

                /* renamed from: a, reason: collision with root package name */
                public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.UploadingFailed f204757a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.UploadingFailed();

                private UploadingFailed() {
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.UploadingFailed)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 1510362345;
                }

                public java.lang.String toString() {
                    return "UploadingFailed";
                }
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Idle;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes5.dex */
        public static final /* data */ class Idle implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State {

            /* renamed from: a, reason: collision with root package name */
            public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Idle f204758a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Idle();

            private Idle() {
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Idle)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 771715504;
            }

            public java.lang.String toString() {
                return "Idle";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Prepared;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State;", "Paused", "Playing", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Prepared$Paused;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Prepared$Playing;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public interface Prepared extends com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State {

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Prepared$Paused;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Prepared;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes5.dex */
            public static final /* data */ class Paused implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Prepared {

                /* renamed from: a, reason: collision with root package name */
                public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Prepared.Paused f204759a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Prepared.Paused();

                private Paused() {
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Prepared.Paused)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 347149507;
                }

                public java.lang.String toString() {
                    return "Paused";
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Prepared$Playing;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Prepared;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes5.dex */
            public static final /* data */ class Playing implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Prepared {

                /* renamed from: a, reason: collision with root package name */
                public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Prepared.Playing f204760a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Prepared.Playing();

                private Playing() {
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Prepared.Playing)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return -1826633927;
                }

                public java.lang.String toString() {
                    return "Playing";
                }
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State;", "Downloading", "PreparingVideoView", "Uploading", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Downloading;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$PreparingVideoView;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public interface Preparing extends com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State {

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Downloading;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes5.dex */
            public static final /* data */ class Downloading implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing {

                /* renamed from: a, reason: collision with root package name */
                public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Downloading f204761a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Downloading();

                private Downloading() {
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Downloading)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 1847222516;
                }

                public java.lang.String toString() {
                    return "Downloading";
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$PreparingVideoView;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes5.dex */
            public static final /* data */ class PreparingVideoView implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing {

                /* renamed from: a, reason: collision with root package name */
                public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.PreparingVideoView f204762a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.PreparingVideoView();

                private PreparingVideoView() {
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.PreparingVideoView)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 1462890050;
                }

                public java.lang.String toString() {
                    return "PreparingVideoView";
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing;", "Remuxing", "UploadingOrigin", "UploadingPaused", "UploadingThumb", "WithProgress", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$Remuxing;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$UploadingOrigin;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$UploadingPaused;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$UploadingThumb;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public interface Uploading extends com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing {

                @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$Remuxing;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
                /* loaded from: classes5.dex */
                public static final /* data */ class Remuxing implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading {

                    /* renamed from: a, reason: collision with root package name */
                    public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.Remuxing f204763a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.Remuxing();

                    private Remuxing() {
                    }

                    public boolean equals(java.lang.Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.Remuxing)) {
                            return false;
                        }
                        return true;
                    }

                    public int hashCode() {
                        return 364088152;
                    }

                    public java.lang.String toString() {
                        return "Remuxing";
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$UploadingOrigin;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$WithProgress;", "app_release"}, k = 1, mv = {1, 9, 0})
                /* loaded from: classes5.dex */
                public static final /* data */ class UploadingOrigin implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.WithProgress {

                    /* renamed from: a, reason: collision with root package name */
                    public final int f204764a;

                    public UploadingOrigin(int i17) {
                        this.f204764a = i17;
                    }

                    public boolean equals(java.lang.Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.UploadingOrigin) && this.f204764a == ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.UploadingOrigin) obj).f204764a;
                    }

                    @Override // com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.WithProgress
                    /* renamed from: getProgress, reason: from getter */
                    public int getF204765a() {
                        return this.f204764a;
                    }

                    public int hashCode() {
                        return java.lang.Integer.hashCode(this.f204764a);
                    }

                    public java.lang.String toString() {
                        return "UploadingOrigin(progress=" + this.f204764a + ')';
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$UploadingPaused;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$WithProgress;", "app_release"}, k = 1, mv = {1, 9, 0})
                /* loaded from: classes5.dex */
                public static final /* data */ class UploadingPaused implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.WithProgress {

                    /* renamed from: a, reason: collision with root package name */
                    public final int f204765a;

                    public UploadingPaused(int i17) {
                        this.f204765a = i17;
                    }

                    public boolean equals(java.lang.Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.UploadingPaused) && this.f204765a == ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.UploadingPaused) obj).f204765a;
                    }

                    @Override // com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.WithProgress
                    /* renamed from: getProgress, reason: from getter */
                    public int getF204765a() {
                        return this.f204765a;
                    }

                    public int hashCode() {
                        return java.lang.Integer.hashCode(this.f204765a);
                    }

                    public java.lang.String toString() {
                        return "UploadingPaused(progress=" + this.f204765a + ')';
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$UploadingThumb;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
                /* loaded from: classes5.dex */
                public static final /* data */ class UploadingThumb implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading {

                    /* renamed from: a, reason: collision with root package name */
                    public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.UploadingThumb f204766a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.UploadingThumb();

                    private UploadingThumb() {
                    }

                    public boolean equals(java.lang.Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.UploadingThumb)) {
                            return false;
                        }
                        return true;
                    }

                    public int hashCode() {
                        return -1669674200;
                    }

                    public java.lang.String toString() {
                        return "UploadingThumb";
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$WithProgress;", "", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$UploadingOrigin;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Preparing$Uploading$UploadingPaused;", "app_release"}, k = 1, mv = {1, 9, 0})
                /* loaded from: classes5.dex */
                public interface WithProgress {
                    /* renamed from: getProgress */
                    int getF204765a();
                }
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State$Stopped;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$State;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes5.dex */
        public static final /* data */ class Stopped implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State {

            /* renamed from: a, reason: collision with root package name */
            public static final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Stopped f204767a = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Stopped();

            private Stopped() {
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Stopped)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -36978063;
            }

            public java.lang.String toString() {
                return "Stopped";
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingMediaGroupVideoItemMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0 getAttachState() {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0 g0Var;
        b11.a viewModel = getViewModel();
        b11.d dVar = viewModel instanceof b11.d ? (b11.d) viewModel : null;
        if (dVar == null) {
            g0Var = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Idle.f204758a, null, 2, null);
        } else if (this.isTopView && this.f204728o) {
            b11.f fVar = dVar.B;
            g0Var = fVar != null && fVar.l() ? x(dVar) : new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.PreparingVideoView.f204762a, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.c0.f204777a);
        } else {
            g0Var = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Idle.f204758a, null, 2, null);
        }
        return dVar != null ? A(g0Var, new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.w(dVar), new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e0(dVar), new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.y(dVar)) : g0Var;
    }

    private final boolean getForbidTryPrepareDownload() {
        return kotlin.jvm.internal.o.b(bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupVideoForbidPrepareDownload()), 1);
    }

    private final boolean getForbidTryPrepareLocal() {
        return kotlin.jvm.internal.o.b(bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupVideoForbidPrepareLocal()), 1);
    }

    private final boolean getForbidTryPrepareOnline() {
        return kotlin.jvm.internal.o.b(bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupVideoForbidPrepareOnline()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if ((r0 != null && r3.f204798a.k() == r0.longValue()) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 getPrepareContext() {
        /*
            r8 = this;
            q31.p r0 = r8.getViewModel()
            boolean r1 = r0 instanceof b11.d
            r2 = 0
            if (r1 == 0) goto Lc
            b11.d r0 = (b11.d) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            java.lang.String r1 = r8.f204726m
            if (r0 != 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "prepareContext, "
            r0.<init>(r3)
            java.lang.Class<b11.d> r3 = b11.d.class
            java.lang.String r3 = r3.getSimpleName()
            r0.append(r3)
            java.lang.String r3 = " expected, "
            r0.append(r3)
            q31.p r3 = r8.getViewModel()
            b11.a r3 = (b11.a) r3
            if (r3 == 0) goto L38
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            goto L39
        L38:
            r3 = r2
        L39:
            r0.append(r3)
            java.lang.String r3 = " instead, skip"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.w(r1, r0)
            return r2
        L49:
            b11.f r0 = r0.B
            if (r0 == 0) goto L56
            long r3 = r0.k()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L57
        L56:
            r0 = r2
        L57:
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 r3 = r8.f204735v
            if (r3 == 0) goto L71
            if (r0 == 0) goto L6d
            b11.f r4 = r3.f204798a
            long r4 = r4.k()
            long r6 = r0.longValue()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L6d
            r0 = 1
            goto L6e
        L6d:
            r0 = 0
        L6e:
            if (r0 == 0) goto L71
            goto L72
        L71:
            r3 = r2
        L72:
            if (r3 != 0) goto L7b
            java.lang.String r0 = "prepareContext, not ready / failed / stale, skip"
            com.tencent.mars.xlog.Log.w(r1, r0)
            return r2
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.getPrepareContext():com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0");
    }

    private final boolean getShowDebugInfo() {
        return kotlin.jvm.internal.o.b(bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupShowDebugInfo()), 1);
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pk4.d getVideoView() {
        return (pk4.d) this.videoView.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(4:19|(2:21|(2:23|24))|25|26)|12|13|14))|30|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        com.tencent.mars.xlog.Log.w(r5.f204726m, "awaitPrepareContext, cancelled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002f, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        com.tencent.mars.xlog.Log.w(r5.f204726m, "awaitPrepareContext, failed: " + r6.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.j0
            if (r0 == 0) goto L16
            r0 = r6
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.j0 r0 = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.j0) r0
            int r1 = r0.f204816g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f204816g = r1
            goto L1b
        L16:
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.j0 r0 = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.j0
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f204814e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f204816g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f204813d
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView r5 = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView) r5
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L6d
            goto L4c
        L2f:
            r6 = move-exception
            goto L55
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.f1 r6 = r5.f204733t
            if (r6 != 0) goto L41
            goto L74
        L41:
            r0.f204813d = r5     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L6d
            r0.f204816g = r3     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L6d
            java.lang.Object r6 = r6.k(r0)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L6d
            if (r6 != r1) goto L4c
            goto L75
        L4c:
            r0 = r6
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 r0 = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0) r0     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L6d
            r5.f204735v = r0     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L6d
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 r6 = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0) r6     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L6d
            r1 = r6
            goto L75
        L55:
            java.lang.String r5 = r5.f204726m
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "awaitPrepareContext, failed: "
            r0.<init>(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.tencent.mars.xlog.Log.w(r5, r6)
            goto L74
        L6d:
            java.lang.String r5 = r5.f204726m
            java.lang.String r6 = "awaitPrepareContext, cancelled"
            com.tencent.mars.xlog.Log.w(r5, r6)
        L74:
            r1 = r4
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.n(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final fk4.u o(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView, com.tencent.mm.storage.f9 f9Var, t21.v2 v2Var) {
        chattingMediaGroupVideoItemMvvmView.getClass();
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = new com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct();
        tPVideoPlayReportStruct.f61055i = f9Var.I0();
        return new fk4.k(new com.tencent.mm.ui.chatting.gallery.q(f9Var, v2Var, new ok4.c(java.lang.System.currentTimeMillis()), new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.m0(tPVideoPlayReportStruct, v2Var)));
    }

    public static final boolean r(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView, com.tencent.mm.storage.f9 f9Var, t21.v2 v2Var) {
        if (chattingMediaGroupVideoItemMvvmView.getForbidTryPrepareDownload()) {
            com.tencent.mars.xlog.Log.w(chattingMediaGroupVideoItemMvvmView.f204726m, "tryPrepareDownload, action forbidden, skip");
            return false;
        }
        if (v2Var.j()) {
            com.tencent.mars.xlog.Log.i(chattingMediaGroupVideoItemMvvmView.f204726m, "tryPrepareDownload, startCompleteOnlineVideo");
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = f9Var.z0();
            ((vf0.y1) x1Var).getClass();
            t21.d3.K(z07);
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.s0(f9Var));
            wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z08 = f9Var.z0();
            ((vf0.y1) x1Var2).getClass();
            t21.d3.L(z08);
        }
        if (!f9Var.z2() && v2Var.i()) {
            com.tencent.mars.xlog.Log.w(chattingMediaGroupVideoItemMvvmView.f204726m, "tryPrepareDownload, msgInfo not clean and video has been downloaded");
            chattingMediaGroupVideoItemMvvmView.B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$DownloadFailed.f204743a);
            return false;
        }
        wf0.u1 u1Var = chattingMediaGroupVideoItemMvvmView.f204737x;
        if (u1Var != null) {
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().A(u1Var);
        }
        chattingMediaGroupVideoItemMvvmView.f204737x = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.t0(v2Var, chattingMediaGroupVideoItemMvvmView, f9Var);
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().b(chattingMediaGroupVideoItemMvvmView.f204737x, android.os.Looper.getMainLooper());
        chattingMediaGroupVideoItemMvvmView.B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$DownloadStarted.f204745a);
        return true;
    }

    public static final boolean s(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView, com.tencent.mm.storage.f9 f9Var, t21.v2 v2Var, fk4.u uVar) {
        boolean forbidTryPrepareLocal = chattingMediaGroupVideoItemMvvmView.getForbidTryPrepareLocal();
        java.lang.String str = chattingMediaGroupVideoItemMvvmView.f204726m;
        if (forbidTryPrepareLocal) {
            com.tencent.mars.xlog.Log.w(str, "tryPrepareLocal, action forbidden, skip");
            return false;
        }
        fk4.k kVar = (fk4.k) uVar;
        java.lang.String n17 = kVar.n();
        if (n17 == null || !com.tencent.mm.vfs.w6.j(n17)) {
            com.tencent.mars.xlog.Log.w(str, "tryPrepareLocal, file not exists, skip");
            return false;
        }
        if (!kVar.h()) {
            if (!(f9Var.A0() == 1 && !kz5.c0.i(111, 113, 112, 121, 122).contains(java.lang.Integer.valueOf(v2Var.f415011i)))) {
                com.tencent.mars.xlog.Log.w(str, "tryPrepareLocal, video is not downloaded, skip");
                return false;
            }
        }
        ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).fj(n17, f9Var.getMsgId(), 3);
        chattingMediaGroupVideoItemMvvmView.getVideoView().setVideoPath(n17);
        chattingMediaGroupVideoItemMvvmView.getVideoView().prepare();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView r4, com.tencent.mm.storage.f9 r5, fk4.u r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.v0
            if (r0 == 0) goto L16
            r0 = r7
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.v0 r0 = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.v0) r0
            int r1 = r0.f204869h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f204869h = r1
            goto L1b
        L16:
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.v0 r0 = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.v0
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f204867f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f204869h
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f204866e
            r5 = r4
            com.tencent.mm.storage.f9 r5 = (com.tencent.mm.storage.f9) r5
            java.lang.Object r4 = r0.f204865d
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView r4 = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView) r4
            kotlin.ResultKt.throwOnFailure(r7)
            goto L7e
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r7 = r4.getForbidTryPrepareOnline()
            if (r7 == 0) goto L4f
            java.lang.String r4 = r4.f204726m
            java.lang.String r5 = "tryPrepareOnline, action forbidden, skip"
            com.tencent.mars.xlog.Log.w(r4, r5)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto Lab
        L4f:
            fk4.k r6 = (fk4.k) r6
            boolean r7 = r6.o()
            if (r7 != 0) goto L62
            java.lang.String r4 = r4.f204726m
            java.lang.String r5 = "tryPrepareOnline, videoDownloader start failed, skip"
            com.tencent.mars.xlog.Log.w(r4, r5)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto Lab
        L62:
            pk4.d r7 = r4.getVideoView()
            r7.setResourceDownloader(r6)
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.x0 r7 = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.x0
            r2 = 0
            r7.<init>(r4, r6, r2)
            r0.f204865d = r4
            r0.f204866e = r5
            r0.f204869h = r3
            r2 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r7 = kotlinx.coroutines.a4.c(r2, r7, r0)
            if (r7 != r1) goto L7e
            goto Lab
        L7e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto La1
            boolean r6 = r7.booleanValue()
            if (r6 != 0) goto L8b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto Lab
        L8b:
            ku5.u0 r6 = ku5.t0.f312615d
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.w0 r7 = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.w0
            r7.<init>(r5)
            ku5.t0 r6 = (ku5.t0) r6
            r6.g(r7)
            pk4.d r4 = r4.getVideoView()
            r4.prepare()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto Lab
        La1:
            java.lang.String r4 = r4.f204726m
            java.lang.String r5 = "tryPrepareOnline, awaitMoovReady timeout (3000 ms)"
            com.tencent.mars.xlog.Log.w(r4, r5)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.t(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView, com.tencent.mm.storage.f9, fk4.u, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0 A(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0 g0Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.f0... f0VarArr) {
        java.util.List z07 = kz5.z.z0(f0VarArr);
        java.lang.Iterable iterable = g0Var.f204789b;
        if (iterable == null) {
            iterable = kz5.p0.f313996d;
        }
        java.util.List t07 = kz5.n0.t0(z07, iterable);
        if (!(!t07.isEmpty())) {
            t07 = null;
        }
        return new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(g0Var.f204788a, t07);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event r22) {
        /*
            Method dump skipped, instructions count: 3653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event):void");
    }

    public final void C() {
        java.lang.String str;
        int i17;
        if (!getShowDebugInfo()) {
            android.widget.TextView textView = this.f204730q;
            if (textView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView", "updateDebugView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(textView, "com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView", "updateDebugView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(textView, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        v();
        android.widget.TextView textView2 = this.f204730q;
        if (textView2 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(textView2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(textView2, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView", "updateDebugView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(textView2, "com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView", "updateDebugView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(textView2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String name = this.f204727n.getClass().getName();
        java.lang.String p07 = r26.n0.p0(name, "$", name);
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event event = this.f204729p;
        if (event != null) {
            java.lang.String name2 = event.getClass().getName();
            str = r26.n0.p0(name2, "$", name2);
        } else {
            str = "<none>";
        }
        java.lang.String str2 = p07 + '\n' + str;
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State state = this.f204727n;
        if (kotlin.jvm.internal.o.b(state, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Idle.f204758a)) {
            i17 = -16711681;
        } else if (state instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing) {
            i17 = -256;
        } else if (state instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Prepared) {
            i17 = -16711936;
        } else if (state instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed) {
            i17 = -65536;
        } else {
            if (!kotlin.jvm.internal.o.b(state, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Stopped.f204767a)) {
                throw new jz5.j();
            }
            i17 = -1;
        }
        int i18 = i17;
        int L = r26.n0.L(str2, p07, 0, false, 6, null);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(i18), L, p07.length() + L, 33);
        textView2.setText(spannableString);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView
    public android.view.View g(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488584e25, (android.view.ViewGroup) this, false);
        this.f204738y = new em.t(inflate);
        v();
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView
    public android.graphics.Bitmap getBitmap() {
        return this.A.f204809a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r2.compareContent(r3.B) == true) goto L12;
     */
    @Override // com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(b11.a r2, b11.a r3) {
        /*
            r1 = this;
            b11.d r2 = (b11.d) r2
            b11.d r3 = (b11.d) r3
            if (r3 != 0) goto L7
            goto L2b
        L7:
            if (r2 == 0) goto L17
            b11.f r2 = r2.B
            if (r2 == 0) goto L17
            b11.f r0 = r3.B
            boolean r2 = r2.compareContent(r0)
            r0 = 1
            if (r2 != r0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L23
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent$NewViewModel r2 = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$GlobalEvent$NewViewModel
            r2.<init>(r3)
            r1.B(r2)
            goto L2b
        L23:
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$UpdateViewModel r2 = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$UpdateViewModel
            r2.<init>(r3)
            r1.B(r2)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.j(b11.a, b11.a):void");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView
    public void k(boolean z17) {
        this.isTopView = z17;
        em.t tVar = this.f204738y;
        if (tVar != null) {
            tVar.f().setImportantForAccessibility(z17 ? 1 : 2);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView
    public void l() {
        B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$UserEvent$SwipeEnd.f204753a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent.AttachedToWindow.f204740a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event.GlobalEvent.DetachedFromWindow.f204741a);
    }

    public final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0 u(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State state, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event event) {
        com.tencent.mars.xlog.Log.i(this.f204726m, "elseBranchHandle, unrecognized event, do nothing, state: " + this.f204727n.getClass().getSimpleName() + ", event: " + event.getClass().getSimpleName());
        return new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(state, (java.util.List) null);
    }

    public final void v() {
        if (getShowDebugInfo() && this.f204730q == null) {
            em.t tVar = this.f204738y;
            if (tVar == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            android.widget.FrameLayout f17 = tVar.f();
            android.view.ViewGroup viewGroup = f17 instanceof android.view.ViewGroup ? f17 : null;
            if (viewGroup == null) {
                com.tencent.mars.xlog.Log.w(this.f204726m, "ensureDebugView, viewContainer is not ViewGroup, skip");
                return;
            }
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setTextSize(12.0f);
            textView.setTextColor(-1);
            textView.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 1));
            textView.setPadding((int) w(8), (int) w(6), (int) w(8), (int) w(6));
            textView.setBackgroundColor(-1728053248);
            textView.setGravity(17);
            textView.setShadowLayer(2.0f, 0.0f, 0.0f, -872415232);
            textView.setClickable(false);
            textView.setFocusable(false);
            textView.setImportantForAccessibility(2);
            textView.setElevation(w(8));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 16;
            viewGroup.addView(textView, layoutParams);
            textView.bringToFront();
            this.f204730q = textView;
        }
    }

    public final float w(int i17) {
        return getContext().getResources().getDisplayMetrics().density * i17;
    }

    public final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0 x(b11.d dVar) {
        t21.v2 v2Var;
        if (dVar == null) {
            b11.a viewModel = getViewModel();
            dVar = viewModel instanceof b11.d ? (b11.d) viewModel : null;
        }
        java.lang.String str = this.f204726m;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e(str, "getUploadingState, viewModel is null");
            return new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.UploadingFailed.f204757a, null, 2, null);
        }
        z(dVar, true);
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 prepareContext = getPrepareContext();
        if (prepareContext == null || (v2Var = prepareContext.f204800c) == null) {
            com.tencent.mars.xlog.Log.e(str, "getUploadingState, videoInfo is null");
            return new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.UploadingFailed.f204757a, null, 2, null);
        }
        int i17 = v2Var.f415011i;
        boolean s17 = t21.d3.s();
        int n17 = t21.d3.n(v2Var);
        boolean z17 = i17 == 104 || i17 == 103;
        boolean z18 = (z17 && dVar.f469075s) || (i17 == 106 && dVar.f469076t);
        boolean z19 = dVar.f469066g || i17 == 198 || dVar.f469070n;
        return z18 ? new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.Remuxing.f204763a, null, 2, null) : z19 ? new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Failed.UploadingFailed.f204757a, null, 2, null) : i17 == 105 && !z19 ? new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.UploadingPaused(n17), (java.util.List) null) : z17 && !dVar.f469075s && !z19 ? s17 ? new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.UploadingOrigin(n17), (java.util.List) null) : new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.UploadingThumb.f204766a, null, 2, null) : new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.PreparingVideoView.f204762a, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.c0.f204777a);
    }

    public final void y(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.f0 f0Var) {
        yz5.l lVar;
        java.lang.Object m521constructorimpl;
        fk4.u uVar;
        b11.f fVar;
        com.tencent.mm.storage.f9 k17;
        android.graphics.Bitmap q17;
        jz5.f0 f0Var2 = null;
        if (f0Var instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.w) {
            b11.d dVar = ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.w) f0Var).f204870a;
            this.f204728o = dVar.C;
            em.t tVar = this.f204738y;
            if (tVar == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            if (tVar.f254790f == null) {
                tVar.f254790f = (android.widget.ImageView) tVar.f254785a.findViewById(com.tencent.mm.R.id.kwj);
            }
            tVar.f254790f.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.k0(this));
            android.view.View.OnClickListener onClickListener = dVar.f469081y;
            if (onClickListener != null) {
                em.t tVar2 = this.f204738y;
                if (tVar2 == null) {
                    kotlin.jvm.internal.o.o("binding");
                    throw null;
                }
                android.widget.FrameLayout f17 = tVar2.f();
                kotlin.jvm.internal.o.f(f17, "getViewContainer(...)");
                m(f17, onClickListener);
            }
            yz5.l lVar2 = dVar.D;
            if (lVar2 != null) {
                em.t tVar3 = this.f204738y;
                if (tVar3 == null) {
                    kotlin.jvm.internal.o.o("binding");
                    throw null;
                }
                android.widget.RelativeLayout d17 = tVar3.d();
                kotlin.jvm.internal.o.f(d17, "getUploadingContainer(...)");
                m(d17, new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.l0(lVar2, this));
                return;
            }
            return;
        }
        boolean z17 = f0Var instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e0;
        java.lang.String str = this.f204726m;
        if (z17) {
            b11.d dVar2 = ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e0) f0Var).f204783a;
            android.graphics.Bitmap bitmap = dVar2.f469063d;
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.i0 i0Var = this.A;
            if ((bitmap != null && bitmap == i0Var.f204809a) || (fVar = dVar2.B) == null || (k17 = pt0.f0.f358209b1.k(fVar.getTalker(), fVar.k())) == null) {
                return;
            }
            if (dVar2.f469063d != null) {
                com.tencent.mars.xlog.Log.i(str, "parseBitmapFromViewModel, use videoThumb");
                q17 = dVar2.f469063d;
            } else if (dVar2.f469064e != null) {
                com.tencent.mars.xlog.Log.i(str, "parseBitmapFromViewModel, use videoThumbCustomLoader");
                yz5.p pVar = dVar2.f469064e;
                if (pVar != null) {
                    em.t tVar4 = this.f204738y;
                    if (tVar4 == null) {
                        kotlin.jvm.internal.o.o("binding");
                        throw null;
                    }
                    android.widget.ImageView c17 = tVar4.c();
                    kotlin.jvm.internal.o.f(c17, "getThumbIv(...)");
                    pVar.invoke(c17, new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.n0(this));
                }
                q17 = i0Var.f204809a;
            } else {
                com.tencent.mars.xlog.Log.i(str, "parseBitmapFromViewModel, try decodeFile from IC2CFileFeatureService");
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    q17 = com.tencent.mm.sdk.platformtools.x.J(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(k17, k17.z0(), false), null);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    com.tencent.mars.xlog.Log.w(str, "parseBitmapFromViewModel, decodeFile failed, use default");
                    q17 = com.tencent.mm.sdk.platformtools.x.q(getContext().getResources().getColor(com.tencent.mm.R.color.f479219t7, null), getWidth(), getHeight());
                }
            }
            i0Var.a(q17, false);
            return;
        }
        if (f0Var instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.y) {
            z(((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.y) f0Var).f204876a, false);
            return;
        }
        boolean b17 = kotlin.jvm.internal.o.b(f0Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.c0.f204777a);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f204731r;
        if (b17) {
            getVideoView().stop();
            kotlinx.coroutines.r2 r2Var = this.f204732s;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f204732s = v65.i.c(lifecycleScope, null, new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.y0(this, null), 1, null);
            return;
        }
        if (kotlin.jvm.internal.o.b(f0Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.b0.f204774a)) {
            kotlinx.coroutines.r2 r2Var2 = this.f204732s;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            this.f204732s = v65.i.c(lifecycleScope, null, new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.u0(this, null), 1, null);
            return;
        }
        if (kotlin.jvm.internal.o.b(f0Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.a0.f204769a)) {
            if (!getVideoView().e()) {
                com.tencent.mars.xlog.Log.w(str, "tryPlay, videoView is not prepared, skip");
                return;
            } else if (getVideoView().isPlaying()) {
                com.tencent.mars.xlog.Log.w(str, "tryPlay, videoView is already playing, skip");
                return;
            } else {
                getVideoView().start();
                B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$PlaySucceed.f204747a);
                return;
            }
        }
        if (kotlin.jvm.internal.o.b(f0Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.z.f204881a)) {
            if (!getVideoView().e()) {
                com.tencent.mars.xlog.Log.w(str, "tryPause, videoView is not prepared, skip");
                return;
            } else if (!getVideoView().isPlaying()) {
                com.tencent.mars.xlog.Log.w(str, "tryPause, videoView is not playing, skip");
                return;
            } else {
                getVideoView().pause();
                B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$PauseSucceed.f204746a);
                return;
            }
        }
        if (!kotlin.jvm.internal.o.b(f0Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.x.f204872a)) {
            if (kotlin.jvm.internal.o.b(f0Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.d0.f204780a)) {
                com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 prepareContext = getPrepareContext();
                if (prepareContext == null) {
                    com.tencent.mars.xlog.Log.w(str, "trySeekIfProgressExist, prepareContext returns null, skip");
                    return;
                }
                b11.a viewModel = getViewModel();
                b11.d dVar3 = viewModel instanceof b11.d ? (b11.d) viewModel : null;
                if (dVar3 == null || (lVar = dVar3.E) == null) {
                    com.tencent.mars.xlog.Log.w(str, "trySeekIfProgressExist, lastPlayProgress is null, skip");
                    return;
                }
                kotlin.jvm.internal.o.f(prepareContext.f204800c.d(), "getFileName(...)");
                java.lang.String groupId = prepareContext.f204798a.getGroupId();
                if (groupId == null) {
                    groupId = "";
                }
                getVideoView().b(((java.lang.Number) lVar.invoke(new b11.c(r8, groupId, r4.f415015m, 0L, false, false, 56, null))).longValue());
                return;
            }
            return;
        }
        kotlinx.coroutines.r2 r2Var3 = this.f204732s;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        this.f204732s = null;
        this.f204728o = false;
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            getVideoView().stop();
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 prepareContext2 = getPrepareContext();
            if (prepareContext2 != null && (uVar = prepareContext2.f204801d) != null) {
                ((fk4.k) uVar).p();
            }
            wf0.u1 u1Var = this.f204737x;
            if (u1Var != null) {
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().A(u1Var);
                f0Var2 = jz5.f0.f302826a;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var2);
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e(str, "onDetached, videoView stop failed, " + m524exceptionOrNullimpl.getMessage());
        }
    }

    public final void z(b11.d dVar, boolean z17) {
        java.lang.Object m521constructorimpl;
        b11.f fVar = dVar.B;
        java.lang.String str = this.f204726m;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(str, "preloadPrepareContext, mediaInfo is null, skip");
            return;
        }
        if (!z17) {
            java.lang.Long l17 = this.f204734u;
            long k17 = fVar.k();
            if (l17 != null && l17.longValue() == k17 && this.f204733t != null) {
                return;
            }
        }
        this.f204734u = java.lang.Long.valueOf(fVar.k());
        this.f204735v = null;
        kotlinx.coroutines.f1 f1Var = this.f204733t;
        if (f1Var != null) {
            kotlinx.coroutines.p2.a(f1Var, null, 1, null);
        }
        if (!z17) {
            this.f204733t = com.tencent.mm.sdk.coroutines.LifecycleScope.e(this.f204731r, null, new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.r0(fVar, this, null), 1, null);
            return;
        }
        kotlinx.coroutines.z a17 = kotlinx.coroutines.b0.a(null, 1, null);
        this.f204733t = a17;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0) kotlinx.coroutines.l.f(null, new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.p0(fVar, this, null), 1, null));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m528isSuccessimpl(m521constructorimpl)) {
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 h0Var = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0) m521constructorimpl;
            this.f204735v = h0Var;
            ((kotlinx.coroutines.a0) a17).U(h0Var);
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.w(str, "preloadPrepareContext(force), failed: " + m524exceptionOrNullimpl.getMessage());
            ((kotlinx.coroutines.a0) a17).U(new kotlinx.coroutines.e0(m524exceptionOrNullimpl, false, 2, null));
        }
    }

    public /* synthetic */ ChattingMediaGroupVideoItemMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChattingMediaGroupVideoItemMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String str = "MicroMsg.ChattingMediaGroupVideoItemMvvmView@" + hashCode();
        this.f204726m = str;
        this.f204727n = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Idle.f204758a;
        this.f204731r = new com.tencent.mm.sdk.coroutines.LifecycleScope(str, context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, 0, 4, null);
        this.videoView = jz5.h.a(jz5.i.f302831f, new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.a1(context, this));
        this.f204739z = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.d1(this);
        this.A = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.i0(this);
    }
}
